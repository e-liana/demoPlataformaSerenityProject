// java
package com.example.steps.recuperacionContrasena.personaNatural;

import io.cucumber.java.en.*;

public class recuperacionContrasenaNaturalSteps {

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuarioEnPantallaInicioSesion() {
        System.out.println("Given: el usuario está en la pantalla de inicio de sesión");
        // TODO: navegar a la URL de login (usar WebDriver o PageObject)
    }

    @When("hace clic en {string}")
    public void haceClicEnOpcion(String opcion) {
        System.out.println("When/And: hace clic en -> " + opcion);
        // TODO: localizar y hacer clic en la opción indicada (ej.: "Persona Natural" o "¿Olvidaste tu contraseña?")
    }

    @Then("se muestra el flujo de recuperación de contraseña para persona natural")
    public void seMuestraFlujoRecuperacionNatural() {
        System.out.println("Then: se muestra el flujo de recuperación de contraseña para persona natural");
        // TODO: validar que la pantalla/flujo de recuperación para persona natural está visible (asserts)
    }
}
