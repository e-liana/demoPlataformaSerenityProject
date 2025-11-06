Feature: Recuperación de contraseña para persona natural

Scenario: Usuario persona Natural olvida su contraseña
  Given el usuario está en la pantalla de inicio de sesión
  When  hace clic en "Persona Natural"
  And   hace clic en "¿Olvidaste tu contraseña?"
  Then  se muestra el flujo de recuperación de contraseña para persona natural



Feature: Recuperación de contraseña para persona jurídica

Scenario: Usuario persona Juridica olvida su contraseña
  Given el usuario está en la pantalla de inicio de sesión
  When  hace clic en "Persona Persona Jurídica"
  And   hace clic en "¿Olvidaste tu contraseña?"
  Then se muestra el flujo de recuperación de contraseña para persona jurídica