package com.example.steps.registro.personaJuridica;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registroCompletoPJSteps {

    @Given("el usuario ha seleccionado {string}")
    public void usuarioHaSeleccionadoTipoPersona(String tipoPersona) {
        // lógica para verificar selección previa
    }

    @And("ha llenado el formulario paso 1 de 2 correctamente")
    public void llenarFormularioPaso1() {
        // lógica para llenar formulario paso 1
    }

    @When("confirma sus datos en el pop-up")
    public void confirmaDatosPopup() {
        // lógica para confirmar datos
    }

    @And("verifica su identidad con el código enviado")
    public void verificaIdentidadCodigo() {
        // lógica para verificación de identidad
    }

    @Then("el sistema crea la cuenta y muestra mensaje de éxito")
    public void cuentaCreadaConExito() {
        // verificación de creación de cuenta
    }
}
