# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Registro de usuario - Persona Natural

  Background:
    Given el usuario está en la página de inicio de sesión

  Scenario: Acceso al registro desde la pantalla de inicio (Persona Natural)
    When hace clic en el botón "Regístrate"
    Then se muestra la pantalla de bienvenida con opciones de tipo de persona
