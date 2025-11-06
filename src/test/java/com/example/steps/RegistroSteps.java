package com.example.steps;

import io.cucumber.java.en.*;

public class RegistroSteps {

    @Given("el usuario está en la página de registro")
    public void usuarioEnRegistro() {
        System.out.println("entro al Given");// Navegar a registro.html
    }

    @When("selecciona tipo de persona natural y completa el formulario")
    public void completarFormularioRegistro() {
        System.out.println("entro al When");// Completar formulario
    }

    @Then("el sistema crea la cuenta exitosamente")
    public void cuentaCreada() {
        System.out.println("entro al Then");// Verificar creación de cuenta
    }
}
