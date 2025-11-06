# Created by LisethElianaOsorioRe at 6/11/2025
Feature: # Enter feature name here
  # Enter feature description here


  Scenario: Registro completo para persona jurídica
    Given el usuario ha seleccionado "Persona Jurídica"
    And ha llenado el formulario correspondiente
    When confirma sus datos y verifica identidad
    Then el sistema crea la cuenta y muestra mensaje de éxito
