Feature: Navegación desde inicio de sesión a registro

Scenario: Usuario accede a la pantalla de registro desde la pantalla de inicio de sesión
  Given el usuario está en la pantalla de inicio de sesión
  When hace clic en el botón "Regístrate"
  Then se muestra la pantalla de bienvenida con gráficos, botón cancelar, selector de tipo de persona y botón para regresar



Feature: Acceso al portal institucional Davivienda

Scenario: Usuario accede al portal Davivienda desde la pantalla de inicio
  Given el usuario está en la pantalla de inicio
  When hace clic en el logo o enlace de Davivienda
  Then se redirige al portal institucional en una nueva pestaña