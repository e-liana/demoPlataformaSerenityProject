# Created by LisethElianaOsorioRe at 6/11/2025
  #solo se dirige a la pantalla de recuperacion de contrasena para persona natural
Feature: Recuperación de contraseña para persona natural

  Scenario: Usuario persona Natural olvida su contraseña
    Given el usuario está en la página de inicio de sesión
    When hace clic en "Persona natural"
    And hace clic en "¿Olvidaste tu contraseña?"
    Then se muestra el flujo de recuperación de contraseña para persona natural
