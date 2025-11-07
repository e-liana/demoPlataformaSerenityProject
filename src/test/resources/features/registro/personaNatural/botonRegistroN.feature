# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Registro de usuario

  Background:
    Given el usuario Natural está en la pantalla de inicio de sesión para registrarse

  Scenario: el usuario Natural accesa al registro desde la pantalla de inicio
    When hace clic en el botón "Regístrate" en la pantalla de inicio para registrarse como Natural
    Then se muestra la pantalla de bienvenida con opciones de tipo de persona Natural