# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Registro completo de usuario en persona natural # Enter feature name here
  # Enter feature description here

  Scenario: Registro completo para persona natural
    Given el usuario ha seleccionado "Persona Natural" para registrarse como natural
    And ha llenado el formulario PN paso 1 de 2 correctamente
    When confirma sus datos PN en el pop-up
    And verifica su identidad PN con el código enviado
    Then el sistema crea la cuenta PN y muestra mensaje de éxito