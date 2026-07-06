package com.example.steps.comunes;

import com.example.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

/**
 * Steps COMUNES a varios flujos (login, recuperación de contraseña,
 * registro, verificación de identidad).
 *
 * Por qué existe esta clase:
 * Cucumber matchea los steps por TEXTO dentro de todo el "glue"
 * (com.example.steps.*), sin importar el paquete ni si el step
 * fue anotado como @Given/@When/@And/@Then. Antes, el mismo texto
 * ("el usuario está en la pantalla de inicio de sesión", "selecciona
 * {string}", "hace clic en {string}", "accede correctamente a la
 * plataforma", "el usuario está en la pantalla de bienvenida") estaba
 * definido en 3, 4 y hasta 5 clases distintas -> AmbiguousStepDefinitionsException.
 *
 * Regla a partir de ahora: si un texto de step se repite en más de un
 * escenario/feature, se define UNA sola vez aquí. Las clases específicas
 * (LoginSteps, RegistroCompletoSteps, etc.) solo contienen los steps que
 * son realmente distintos entre flujos.
 */
public class ComunSteps {

    @Steps
    LoginPage loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        loginPage.abrir();
        Assert.assertTrue("No se pudo abrir la página de inicio de sesión", loginPage.estaAbierta());
    }

    @Given("el usuario está en la pantalla de bienvenida")
    public void elUsuarioEstaEnLaPantallaDeBienvenida() {
        // La pantalla de bienvenida (selección de tipo de persona) se llega
        // tras hacer clic en "Regístrate" desde el login. Si el escenario
        // no pasa antes por ese paso, se navega directo aquí.
        if (!loginPage.estaAbierta()) {
            loginPage.abrir();
        }
    }

    // Nota: en Cucumber-JVM el keyword (Given/When/And/Then) usado en el
    // .feature NO tiene que coincidir con la anotación usada aquí; el match
    // es solo por texto. Por eso basta con UNA anotación por método aunque
    // en distintos features el mismo texto aparezca como "When" o como "And".
    @When("selecciona {string}")
    public void selecciona(String tipoPersona) {
        loginPage.seleccionarTipoPersona(tipoPersona);
    }

    @When("hace clic en {string}")
    public void haceClicEn(String textoBoton) {
        loginPage.clicEnBoton(textoBoton);
    }

    @Then("accede correctamente a la plataforma")
    public void accedeCorrectamenteALaPlataforma() {
        // TODO: reemplazar por una validación real una vez se conozca el
        // elemento que solo aparece tras login exitoso (ej. menú de usuario,
        // saludo con el nombre, URL del dashboard, etc.)
        Assert.assertTrue(
            "El usuario no parece haber accedido a la plataforma",
            loginPage.getDriver().getCurrentUrl().contains("fisapay.com.co")
        );
    }
}
