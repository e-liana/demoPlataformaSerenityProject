// File: src/test/java/com/example/steps/inicioSesion/ingresoDavivienda/LoginDaviviendaSteps.java
package com.example.steps.inicioSesion.ingresoDavivienda;

import io.cucumber.java.en.*;

public class loginDaviviendaSteps {

    @Given("el usuario está en la pantalla de inicio")
    public void usuarioEnPantallaInicio() {
        System.out.println("Given: el usuario está en la pantalla de inicio");
        // TODO: navegar a la URL de la aplicación (usar WebDriver o PageObject)
    }

    @When("hace clic en el logo o enlace de Davivienda")
    public void clicEnLogoDavivienda() {
        System.out.println("When: hace clic en el logo o enlace de Davivienda");
        // TODO: localizar y hacer clic en el enlace/logo de Davivienda
        // Ej.: guardar ventana/handle actual para luego verificar la nueva pestaña
    }

    @Then("se redirige al portal institucional en una nueva pestaña")
    public void redirigeANuevaPestana() {
        System.out.println("Then: se redirige al portal institucional en una nueva pestaña");
        // TODO: cambiar al handle de la nueva pestaña y verificar la URL/title contiene "davivienda"
        // Ej.: assertTrue(driver.getCurrentUrl().contains("davivienda"));
    }
}
