Feature: Inicio de sesión - Persona Natural

  Scenario: Usuario inicia sesión como persona natural con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    And selecciona "Persona natural"
    When ingresa correo "user@example.com" y contraseña "MiPass123"
    And hace clic en "Ingresar"
    Then accede correctamente a la plataforma
