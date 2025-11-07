package com.example.steps.registro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cancelarRegistroSteps {

    @Given("el usuario está en la pantalla de bienvenida y decide cancelar el registro")
    public void usuarioEnPantallaBienvenidaCancelar() {
        System.out.println("entro al Given");//  pantalla de bienvenida en el proceso de registro
    } @When("hace clic en el botón Cancelar")
    public void clicEnBotonCancelar() {
        System.out.println("entro al When");//
    }

    @Then("el sistema lo redirige a la pantalla de inicio de sesión")
    public void redireccionInicioSesion() {
        System.out.println("entro al Then");// regresa a pantalla de inicio/ inicio sesin independientemente del tipo de persona
    }
}
