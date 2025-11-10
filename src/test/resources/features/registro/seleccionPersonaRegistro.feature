# Created by LisethElianaOsorioRe at 10/11/2025
Feature: Seleccion de tipo de persona para Registrarse# Enter feature name here
  # Enter feature description here

# El usuario viene de pantalla de inicio de sesion, desea registrarse y debe seleccionar el tipo de persona (natural o juridica)
 # Background:
 #   Given El usuario se encuentra en la pantalla de Bienvenida al proceso de Registro

 # Selección de tipo
  Scenario Outline: Selección de tipo de persona para registro desde pantalla Registrp
    Given el usuario está en la pantalla de bienvenida al proceso de registro
    When selecciona "<tipoPersona>" para registrarse
    Then se muestra el formulario correspondiente para registro "<tipoPersona>"


    Examples:
      | tipoPersona      |
      | Persona Natural  |
      | Persona Jurídica |