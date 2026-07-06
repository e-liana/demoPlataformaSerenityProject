# Created by LisethElianaOsorioRe at 6/11/2025
  #solo se dirige a la pantalla de recuperacion de contrasena para persona juridica
Feature: Recuperación de contraseña para persona jurídica

  Scenario: Usuario persona Juridica olvida su contraseña
    Given el usuario está en la página de inicio de sesión
    When hace clic en "Persona jurídica"
    And hace clic en "¿Olvidaste tu contraseña?"
    Then se muestra el flujo de recuperación de contraseña para persona jurídica
