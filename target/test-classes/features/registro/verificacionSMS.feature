# Created by LisethElianaOsorioRe at 7/11/2025


Feature: Verificación de identidad por código SMS

  Scenario: Usuario recibe código de verificación
    Given el usuario está en la pantalla de verificación
    When el sistema envía el código al número registrado
    Then el usuario puede ingresar el código para continuar

  Scenario: Usuario no recibe el código
    Given el usuario espera 59 segundos
    When hace clic en "Reenviar código"
    Then el sistema envía un nuevo código al número registrado