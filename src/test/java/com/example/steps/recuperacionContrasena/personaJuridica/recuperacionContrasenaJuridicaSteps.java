package com.example.steps.recuperacionContrasena.personaJuridica;

import io.cucumber.java.en.*;

public class recuperacionContrasenaJuridicaSteps {

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuarioEnPantallaInicioSesion() {
        System.out.println("Given: el usuario está en la pantalla de inicio de sesión");
        // TODO: navegar a la URL de login (WebDriver / PageObject)
    }

    @When("hace clic en {string}")
    public void haceClicEn(String opcion) {
        System.out.println("When/And: hace clic en -> " + opcion);
        // TODO: localizar y hacer clic en la opción indicada (ej.: "Persona Persona Jurídica" o "¿Olvidaste tu contraseña?")
    }

    @Then("se muestra el flujo de recuperación de contraseña para persona jurídica")
    public void seMuestraFlujoRecuperacion() {
        System.out.println("Then: se muestra el flujo de recuperación de contraseña para persona jurídica");
        // TODO: validar que la pantalla/flujo de recuperación para persona jurídica está visible (asserts)
    }
}
