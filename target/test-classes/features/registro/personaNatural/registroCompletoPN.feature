# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Registro completo de usuario en persona natural

  Scenario: Registro completo para persona natural
    Given el usuario ha seleccionado "Persona Natural"
    And ha llenado el formulario paso 1 de 2 correctamente
    When confirma sus datos en el pop-up
    And verifica su identidad con el código enviado
    Then el sistema crea la cuenta y muestra mensaje de éxito
