package com.example.steps.registro;

import com.example.pages.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;


public class RegistroCompletoSteps {

    @Steps
    RegistroPage registroPage;

    @Given("el usuario ha seleccionado {string}")
    public void usuarioHaSeleccionadoTipoPersona(String tipoPersona) {
        registroPage.clicEnOpcion(tipoPersona);
    }

    @And("ha llenado el formulario paso 1 de 2 correctamente")
    public void llenarFormularioPaso1() {
        // TODO: usar RegistroPage para completar los campos del paso 1
        // (nombres, documento, correo, contraseña, ciudad, etc.)
    }

    @When("confirma sus datos en el pop-up")
    public void confirmaDatosPopup() {
        Assert.assertTrue("No se muestra el pop-up de confirmación de datos",
            registroPage.popupConfirmacionVisible());
        registroPage.clicEnBoton("Confirmar");
    }

    @And("verifica su identidad con el código enviado")
    public void verificaIdentidadCodigo() {
        // TODO: obtener el código real (mock/servicio de pruebas) y usarlo aquí
        registroPage.ingresarCodigoVerificacion("000000");
        registroPage.clicEnBoton("Validar");
    }

    @Then("el sistema crea la cuenta y muestra mensaje de éxito")
    public void cuentaCreadaConExito() {
        // TODO: assert real (mensaje de éxito visible, redirección, etc.)
    }
}
