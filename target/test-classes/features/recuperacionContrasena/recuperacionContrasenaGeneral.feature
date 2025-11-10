# Created by LisethElianaOsorioRe at 7/11/2025
Feature: Recuperación de contraseña - Usuario genérico

  Scenario Outline: Usuario olvida su contraseña y accede al flujo de recuperación
    Given el usuario está en la pantalla de inicio de sesión para recuperar la contrasena
    When hace clic en la opcion"<tipoUsuario>"
    And hace clic en el enlace "¿Olvidaste tu contraseña?"
    Then se muestra el flujo de recuperación de contraseña para <tipoUsuario>

    Examples:
      | tipoUsuario       |
      | Persona Jurídica  |
      | Persona Natural   |