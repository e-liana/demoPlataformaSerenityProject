# Created by LisethElianaOsorioRe at 6/11/2025
  #solo se dirige a la pantalla de recuperacion de contrasena para persona juridica
  #pendinte por revisar posibilidad de un common case para ambos tipos de usuario
Feature: Recuperación de contraseña para persona jurídica

  Scenario: Usuario persona Juridica olvida su contraseña
    Given el usuario está en la pantalla de inicio de sesión
    When  hace clic en "Persona Persona Jurídica"
    And   hace clic en "¿Olvidaste tu contraseña?"
    Then se muestra el flujo de recuperación de contraseña para persona jurídica