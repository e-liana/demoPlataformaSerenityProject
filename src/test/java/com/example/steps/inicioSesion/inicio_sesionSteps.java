package com.example.steps.inicioSesion;

import io.cucumber.java.en.*;

public class inicio_sesionSteps {

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuarioEnPantallaInicioSesion() {
        System.out.println("Given: usuario en la pantalla de inicio de sesión");
        // TODO: navegar a la pantalla de inicio de sesión
    }

    @When("hace clic en el botón {string}")
    public void haceClicEnElBoton(String boton) {
        System.out.println("When: hace clic en el botón -> " + boton);
        // TODO: acción de clic en el botón indicado
    }

    @Then("se muestra la pantalla de bienvenida con gráficos, botón cancelar, selector de tipo de persona y botón para regresar")
    public void pantallaBienvenidaMostrada() {
        System.out.println("Then: pantalla de bienvenida mostrada");
        // TODO: verificaciones de elementos en la pantalla de bienvenida
    }

    @Given("el usuario está en la pantalla de inicio")
    public void usuarioEnPantallaInicio() {
        System.out.println("Given: usuario en la pantalla de inicio");
        // TODO: navegar a la pantalla de inicio
    }

    @When("hace clic en el logo o enlace de Davivienda")
    public void clicEnLogoDavivienda() {
        System.out.println("When: hace clic en el logo o enlace de Davivienda");
        // TODO: acción de abrir enlace/validar nueva pestaña
    }

    @Then("se redirige al portal institucional en una nueva pestaña")
    public void redirigePortalInstitucional() {
        System.out.println("Then: redirigido al portal institucional en nueva pestaña");
        // TODO: comprobar que se abrió una nueva pestaña y su URL
    }
}
