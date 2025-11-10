package com.example.steps.registro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class botonRegistrateGeneralSteps {


    @Given("el usuario está en la página de inicio de sesión y quiere registrarse")
    public void elUsuarioEstaEnLaPaginaDeInicioRegistrarse() {
        // Lógica para abrir la página de inicio de sesión
        // y simular la intención de registrarse
        System.out.println("entro al Given, usuario en pagina de inicio de sesion quiere registrarse");
    }

    // escoger un tipo de persona es opcional, no afecta el flujo principal
    @Given("selecciona {string} para registro base")
    public void seleccionaTipoUsuarioRegistroBase(String tipoUsuario) {
        // Lógica para seleccionar el tipo de usuario (por ejemplo: "Persona natural", "Empresa", etc.)
        System.out.println("entro al Given, usuario escoge un tipo de persona");
    }

    @When("hace clic en el botón {string} en la pantalla de inicio para registrarse")
    public void haceClicEnElBotonEnLaPantallaDeInicioRegistro(String boton) {
        // Lógica para hacer clic en el botón "Regístrate"
        System.out.println("entro al When, usuario hace clic en boton registrate");
    }

    @Then("se muestra la pantalla de bienvenida al proceso de registro con opciones de tipo de persona")
    public void seMuestraPantallaDeBienvenidaOpcionesP() {
        // Lógica para verificar que se muestra la pantalla de bienvenida
        // con las opciones correspondientes
        System.out.println("entro al Then, sistema muestra pantalla de bienvenida al proceso de registro ");
    }

}
