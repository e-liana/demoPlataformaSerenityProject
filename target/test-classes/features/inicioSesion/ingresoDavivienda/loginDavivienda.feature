Feature: Acceso al portal institucional Davivienda

Scenario: Usuario accede al portal Davivienda desde la pantalla de inicio
  Given el usuario está en la pantalla de inicio y quiere iniciar sesion en Davivienda
  When hace clic en el logo o enlace de Davivienda
  Then se redirige al portal institucional Davivienda en una nueva pestaña