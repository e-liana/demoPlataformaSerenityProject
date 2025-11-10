Feature: Confirmación de datos antes de verificación

Scenario: Usuario revisa y confirma sus datos
  Given el usuario ha completado el formulario de registro
  When se muestra el pop-up con cédula y correo
  And el usuario hace clic en "Confirmar"
  Then el sistema procede al paso de verificación de identidad



