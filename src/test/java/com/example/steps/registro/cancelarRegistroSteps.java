package com.example.steps.registro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cancelarRegistroSteps {

    @Given("el usuario está en la pantalla de bienvenida")
    public void usuarioEnPantallaBienvenida() {
        System.out.println("entro al Given");//
    } @When("hace clic en el botón Cancelar")
    public void clicEnBotonCancelar() {
        System.out.println("entro al When");//
    }

    @Then("el sistema lo redirige a la pantalla de inicio de sesión")
    public void redireccionInicioSesion() {
        System.out.println("entro al Then");// regresa a pantalla de inicio/ inicio sesin independientemente del tipo de persona
    }
}
