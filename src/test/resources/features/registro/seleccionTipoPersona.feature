 # Created by LisethElianaOsorioRe at 6/11/2025
Feature: Selección de tipo de persona en el registro
  # Enter feature description here

  Scenario Outline: Selección de tipo de persona para registro
    Given el usuario está en la pantalla de bienvenida y se quiere registrar
    When selecciona "<tipoPersona>" persona para registro
    Then se muestra el formulario correspondiente para <tipoPersona>

    Examples:
      | tipoPersona      |
      | Persona Natural  |
      | Persona Jurídica |