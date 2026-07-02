# Created by LisethElianaOsorioRe at 6/11/2025
#Feature: # Enter feature name here
  # Enter feature description here

 # Scenario: # Enter scenario name here
    # Enter steps here
# este caso no se esta usando

Feature: Registro de usuario unificado (Persona Natural y Persona Jurídica)

  Background:
    Given el usuario está en la pantalla de inicio de sesión

  # Entrada al flujo
  Scenario: Acceso al registro desde la pantalla de inicio
    When hace clic en el botón "Regístrate"
    Then se muestra la pantalla de bienvenida con opciones de tipo de persona
    And se muestran las opciones "Persona Natural" y "Persona Jurídica"



  # Selección de tipo
  Scenario Outline: Selección de tipo de persona
    Given el usuario está en la pantalla de bienvenida
    When selecciona "<tipoPersona>"
    Then se muestra el paso "Datos de cuenta" (paso 1 de 3)
    And el tipo de persona seleccionado "<tipoPersona>" queda preseleccionado para pasos siguientes

    Examples:
      | tipoPersona      |
      | Persona Natural  |
      | Persona Jurídica |

  # Paso 1: Datos comunes de cuenta
  Scenario: Completar datos de cuenta válidos
    Given el usuario está en el paso "Datos de cuenta"
    When ingresa un correo no registrado
    And ingresa una contraseña válida y su confirmación coincidente
    And acepta Términos y Condiciones y Política de Privacidad
    And supera el control captcha
    And hace clic en "Continuar"
    Then el sistema envía un código de verificación al correo
    And el sistema muestra el paso "Verificación" (paso 2 de 3)

  Scenario: Intento de registro con correo ya registrado
    Given el usuario está en el paso "Datos de cuenta"
    When ingresa un correo ya registrado
    And completa los demás campos correctamente
    And hace clic en "Continuar"
    Then el sistema muestra un mensaje "El correo ya está registrado"
    And ofrece un enlace "Iniciar sesión" y "Recuperar contraseña"

  Scenario: Validación de contraseña débil
    Given el usuario está en el paso "Datos de cuenta"
    When ingresa una contraseña que no cumple la política
    And hace clic en "Continuar"
    Then el sistema resalta el campo contraseña con el detalle de la regla incumplida

  # Paso 2: Verificación (OTP)
  Scenario: Verificación exitosa del código OTP
    Given el usuario está en el paso "Verificación"
    And el sistema ha enviado un código de 6 dígitos al numero de celular registrado
    When ingresa el código válido dentro del tiempo permitido
    And hace clic en "Validar"
    Then el sistema confirma la verificación
    And el sistema muestra el paso "Datos del perfil" (paso 3 de 3)

  Scenario: Código OTP incorrecto
    Given el usuario está en el paso "Verificación"
    When ingresa un código incorrecto
    Then el sistema muestra "Código inválido"
    And permite reintentar hasta 3 intentos

  Scenario: Reenvío de código OTP con cooldown
    Given el usuario está en el paso "Verificación"
    And el temporizador de reenvío es de 60 segundos
    When el usuario solicita reenvío antes de 60 segundos
    Then el sistema muestra "Espera 60 segundos para reenviar"
    When el temporizador llega a 0 y el usuario solicita reenvío
    Then el sistema envía un nuevo código y reinicia el temporizador

  # Paso 3: Datos del perfil (diverge por tipo)
  Scenario: Registro completo para Persona Natural
    Given el usuario verificó el correo y seleccionó "Persona Natural"
    And completa nombres, apellidos, tipo y número de documento, fecha de nacimiento, celular y ubicación válidos
    When revisa el resumen y confirma
    Then el sistema crea la cuenta con rol "Persona Natural"
    And muestra mensaje de éxito
    And ofrece iniciar sesión automáticamente

  Scenario: Registro completo para Persona Jurídica
    Given el usuario verificó el correo y seleccionó "Persona Jurídica"
    And completa razón social, NIT, representante legal (nombre y documento), email corporativo (opcional), teléfono y ubicación válidos
    When revisa el resumen y confirma
    Then el sistema crea la cuenta con rol "Persona Jurídica"
    And muestra mensaje de éxito
    And ofrece iniciar sesión automáticamente

  # Edge cases de consistencia y seguridad
  Scenario: Interrupción y reanudación después de verificar correo
    Given el usuario completó "Datos de cuenta" y verificó el correo
    And cierra el navegador
    When vuelve a abrir el vínculo del correo o accede a "Continuar registro"
    Then el sistema reanuda en "Datos del perfil" (paso 3 de 3)

  Scenario: Bloqueo temporal por múltiples intentos fallidos de OTP
    Given el usuario falló la verificación del código 3 veces
    When intenta un cuarto intento
    Then el sistema bloquea la verificación por 15 minutos
    And muestra "Has alcanzado el número máximo de intentos. Intenta más tarde."