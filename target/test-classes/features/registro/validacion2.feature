# Created by LisethElianaOsorioRe at 7/11/2025


  #separar este escenario en otro feature, revisar hasta donde debe ir cada escenario

Feature: Validación de contraseña segura

  Scenario: Usuario ingresa contraseña que cumple con los requisitos
    Given el usuario está en el campo de contraseña
    When ingresa "Aa1234567."
    Then el sistema acepta la contraseña como válida

  Scenario: Usuario ingresa contraseña sin carácter especial
    Given el usuario está en el campo de contraseña
    When ingresa "Aa12345678"
    Then el sistema muestra error indicando falta de carácter especial