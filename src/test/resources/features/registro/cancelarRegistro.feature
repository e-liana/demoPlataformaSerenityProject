# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Cancelar registro
  # Enter feature name here
  # Enter feature description here

  Scenario: Cancelación del proceso de registro
    Given el usuario está en la pantalla de bienvenida
    When hace clic en el botón "Cancelar"
    Then el sistema lo redirige a la pantalla de inicio de sesión