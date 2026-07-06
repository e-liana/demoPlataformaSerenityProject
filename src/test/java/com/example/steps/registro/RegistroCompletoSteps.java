package com.example.steps.registro;

import com.example.pages.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

/**
 * Reemplaza a registroCompletoPJSteps.java y registroCompletoPNSteps.java
 * (copia exacta una de otra -> 5 steps ambiguos).
 *
 * Bug adicional encontrado y corregido: registroCompletoPJ.feature usaba un
 * texto distinto al de su propia clase de steps ("ha llenado el formulario
 * correspondiente" y "confirma sus datos y verifica identidad" en vez de
 * "ha llenado el formulario paso 1 de 2 correctamente" / "confirma sus
 * datos en el pop-up" + "verifica su identidad..."), es decir, el
 * escenario de Persona Jurídica tenía TODOS sus steps como "undefined".
 * Se alineó el .feature de PJ con el mismo texto que PN.
 */
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
