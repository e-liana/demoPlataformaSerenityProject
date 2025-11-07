package com.example.steps.registro.personaNatural;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registroCompletoPNSteps {

    @Given("el usuario ha seleccionado {string} para registrarse como natural")
    public void usuarioHaSeleccionadoTipoPersonaPN(String tipoPersona) {
        // lógica para verificar selección previa
    }

    @And("ha llenado el formulario PN paso 1 de 2 correctamente")
    public void llenarFormularioPNPaso1() {
        // lógica para llenar formulario paso 1
    }

    @When("confirma sus datos PN en el pop-up")
    public void confirmaDatosPNPopup() {
        // lógica para confirmar datos
    }

    @And("verifica su identidad PN con el código enviado")
    public void verificaIdentidadPNCodigo() {
        // lógica para verificación de identidad
    }

    @Then("el sistema crea la cuenta PN y muestra mensaje de éxito")
    public void cuentaCreadaConExitoPN() {
        // verificación de creación de cuenta
    }
}
