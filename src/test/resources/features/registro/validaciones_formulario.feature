@wip
Feature: Validación de campos en el formulario de registro

Scenario Outline: Validación de campos obligatorios y formato
  Given el usuario está en el formulario de registro paso 1 de 2
  When ingresa <Nombres>, <Apellidos>, <Numero de celular>, <Numero de documento>, <email>, <contraseña>, <confirmar contraseña>, <Via>, <campoDireccion1>, <campoDireccion2> y selecciona <ciudad>, <Tipo de documento>, <Tipo de via>
  And clickea el cuadro para aceptar Términos y Condiciones, Declaracion de beneficiarios y tratamiento de datos personales
  And selecciona Siguiente
  Then el sistema genera un pop up que muestra <cedula> y <correo> con el mensaje "Por favor confirma tus datos"
  #separar casos de prueba de datos validos y no validos y pantalla de codigo de verificacion
  And el usuario confirma los datos seleeccionando "Confirmar"
  Then el sistema muestra un mensaje de Codigo de Verificacion enviado a <Numero de celular>

Examples:
  | Nombres | Apellidos | Numero de celular | email               | contraseña | ciudad   | confirmar contraseña | Via | campoDireccion1 | campoDireccion2 | Numero de documento | Tipo de documento | Tipo de via |
  | Ana     | Martin    | 3102134564        | usuario@dominio.com | Aa1234567. | Medellín | Aa1234567.           | 2   | 23              | 567             | 123                 | Pasaporte         | Calle       |
  | Juan    | Perez     | 3225001122        | usuario.com         | Aa1234567. | Medellín | Aa1234567.           | 3   | 45              | 2               | 456                 | Tarjeta Identidad | Carrera     |
  | Maria   | Niño      | 3115446688        | usuario@dominio.com | 12345678   | Medellín | 12345678             | 4   | 13              | 75              | 789                 | Pasaporte         | Avenida     |

