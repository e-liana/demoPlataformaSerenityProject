package com.example.steps;

import io.cucumber.java.en.*;

public class RegistroSteps {

    @Given("el usuario está en la página de registro")
    public void usuarioEnRegistro() {
        // Navegar a registro.html
    }

    @When("selecciona tipo de persona natural y completa el formulario")
    public void completarFormularioRegistro() {
        // Completar formulario
    }

    @Then("el sistema crea la cuenta exitosamente")
    public void cuentaCreada() {
        // Verificar creación de cuenta
    }
}
