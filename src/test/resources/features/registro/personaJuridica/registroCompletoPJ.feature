# Created by LisethElianaOsorioRe at 6/11/2025
Feature: # Enter feature name here
  # Enter feature description here


  Scenario: Registro completo para persona jurídica
    Given el usuario ha seleccionado "Persona Jurídica" para registrarse como juridica
    And ha llenado el formulario PJ correspondiente
    When confirma sus datos PJ y verifica identidad
    Then el sistema crea la cuenta PJ y muestra mensaje de éxito
