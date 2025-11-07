# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Registro de usuario

  Background:
    Given el usuario está en la pantalla de inicio de sesión para registrarse

  Scenario: el usuario Juridico accesa al registro desde la pantalla de inicio para registrarse
    When hace clic en el botón "Regístrate" para registrarse como Juridico
    Then se muestra la pantalla de bienvenida con opciones de tipo de persona Juridica