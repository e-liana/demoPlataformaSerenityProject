
# Created by LisethElianaOsorioRe at 6/11/2025
  #solo se dirige a la pantalla de recuperacion de contrasena para persona natural
  #pendinte por revisar posibilidad de un common case para ambos tipos de usuario

Feature: Recuperación de contraseña para persona natural

Scenario: Usuario persona Natural olvida su contraseña
  Given el usuario está en la pantalla de inicio de sesión
  When  hace clic en "Persona Natural"
  And   hace clic en el enlace "¿Olvidaste tu contraseña?"
  Then  se muestra el flujo de recuperación de contraseña para persona natural



