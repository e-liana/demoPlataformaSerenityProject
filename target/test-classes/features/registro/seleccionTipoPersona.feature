 # Created by LisethElianaOsorioRe at 6/11/2025
Feature: Selección de tipo de persona en el registro

  Scenario Outline: Selección de tipo de persona
    Given el usuario está en la pantalla de bienvenida
    When selecciona "<tipoPersona>"
    Then se muestra el formulario correspondiente para "<tipoPersona>"

    Examples:
      | tipoPersona      |
      | Persona Natural  |
      | Persona Jurídica |
