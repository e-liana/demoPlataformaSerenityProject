Feature: Verificación de identidad - Envío y reenvío de código OTP

  # Estos steps ya existían implementados en verificacion_identidadSteps.java
  # pero no tenían ningún .feature que los invocara (quedaban huérfanos).

  Scenario: El sistema envía el código de verificación al número registrado
    Given el usuario está en la pantalla de verificación
    When el sistema envía el código al número registrado
    Then el usuario puede ingresar el código para continuar

  Scenario: Reenvío de código OTP luego de esperar el tiempo mínimo
    Given el usuario está en la pantalla de verificación
    And el usuario espera 59 segundos
    When hace clic en "Reenviar código"
    Then el sistema envía un nuevo código al número registrado
