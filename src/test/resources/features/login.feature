Feature: Inicio de sesión


  // considerar seleccion de tipo de persona antes de ingresar credenciales

Scenario: Usuario inicia sesión con credenciales válidas
  Given el usuario está en la página de inicio de sesión
  When ingresa usuario y contraseña válidos
  Then accede correctamente a la plataforma
