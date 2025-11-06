Feature: Registro de usuario

  Background:
    Given el usuario está en la pantalla de inicio de sesión

  Scenario: Acceso al registro desde la pantalla de inicio
    When hace clic en el botón "Regístrate"
    Then se muestra la pantalla de bienvenida con opciones de tipo de persona

  Scenario: Cancelación del proceso de registro
    Given el usuario está en la pantalla de bienvenida
    When hace clic en el botón "Cancelar"
    Then el sistema lo redirige a la pantalla de inicio de sesión

  Scenario Outline: Selección de tipo de persona
    Given el usuario está en la pantalla de bienvenida
    When selecciona "<tipoPersona>"
    Then se muestra el formulario correspondiente para <tipoPersona>

    Examples:
      | tipoPersona       |
      | Persona Natural   |
      | Persona Jurídica  |

  Scenario: Registro completo para persona natural
    Given el usuario ha seleccionado "Persona Natural"
    And ha llenado el formulario paso 1 de 2 correctamente
    When confirma sus datos en el pop-up
    And verifica su identidad con el código enviado
    Then el sistema crea la cuenta y muestra mensaje de éxito

  Scenario: Registro completo para persona jurídica
    Given el usuario ha seleccionado "Persona Jurídica"
    And ha llenado el formulario correspondiente
    When confirma sus datos y verifica identidad
    Then el sistema crea la cuenta y muestra mensaje de éxito
