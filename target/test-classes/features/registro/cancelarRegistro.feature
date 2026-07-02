# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Cancelar registro
    Background:
        Given el usuario está en la pantalla de Registro

  Scenario: Cancelación del proceso de registro desde bienvenida
    Given el usuario está en la pantalla de bienvenida y decide cancelar el registro
    When hace clic en el botón "Cancelar" desde la pantalla de bienvenida
    Then el sistema cancela el registro y lo redirige a la pantalla de inicio de sesión