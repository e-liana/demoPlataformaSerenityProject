# Created by LisethElianaOsorioRe at 10/11/2025
Feature: Registro de usuario desde boton "Regístrate" en pagina de inicio
  # Enter feature description here

  Scenario: El usuario esta en la pagina de inicio, elige el tipo de persona y se quiere registrar

    # Enter steps here
    Given el usuario está en la página de inicio de sesión y quiere registrarse
    #// escoger un tipo de persona es opcional, no afecta el flujo principal
    And selecciona "<tipoUsuario>" para registro base
    When hace clic en el botón "Regístrate" en la pantalla de inicio para registrarse
    Then se muestra la pantalla de bienvenida al proceso de registro con opciones de tipo de persona


    #Mapear el caso de ir al inicio de sesion desde aca, con un common case o evaluar si es necesario un caso especifico
