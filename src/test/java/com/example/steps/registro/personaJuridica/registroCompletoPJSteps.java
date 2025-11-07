package com.example.steps.registro.personaJuridica;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registroCompletoPJSteps {

    @Given("el usuario ha seleccionado {string} para registrarse como juridica")
    public void usuarioHaSeleccionadoTipoPersonaPJ(String tipoPersona) {
        // lógica para verificar selección previa
    }

    @And("ha llenado el formulario PJ correspondiente")
    public void llenarFormularioPJPaso1() {
        // lógica para llenar formulario paso 1
    }

    @When("confirma sus datos PJ y verifica identidad")
    public void confirmaDatosPJPopup() {
        // lógica para confirmar datos
    }

    /*@And("verifica su identidad PJ con el código enviado")
    public void verificaIdentidadCodigo() {
        // lógica para verificación de identidad
    }
*/
    @Then("el sistema crea la cuenta PJ y muestra mensaje de éxito")
    public void cuentaCreadaConExitoPJ() {
        // verificación de creación de cuenta
    }
}
