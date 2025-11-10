# Created by LisethElianaOsorioRe at 7/11/2025
Feature: Inicio de sesión - Usuario genérico

  Scenario Outline: Usuario inicia sesión con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    And selecciona "<tipoUsuario>" para login
    When ingresa credenciales necesarias para login <credenciales>
    And hace clic en el boton "Ingresar" en la pantalla de inicio de sesión
    Then accede correctamente a la plataforma

    Examples:
      | tipoUsuario     | credenciales                                                                 |
      | Persona jurídica| NIT "123456789-0", correo "empresa@example.com" y contraseña "EmpresaPass123"|
      | Persona natural | correo "user@example.com" y contraseña "MiPass123"                           |