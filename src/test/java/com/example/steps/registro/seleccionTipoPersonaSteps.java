package com.example.steps.registro;

import io.cucumber.java.en.*;

public class seleccionTipoPersonaSteps {

    @Given("el usuario está en la pantalla de bienvenida y se quiere registrar")
    public void usuarioEnPantallaBienvenidaRegistrar() {
        System.out.println("Given el usuario está en la pantalla de selección de tipo de persona");
    }

    @When("selecciona {string} persona para registro")
    public void seleccionaTipoPersonaRegistro(String tipoPersona) {
        System.out.println("When el usuario selecciona el tipo de persona");// lógica para seleccionar tipo de persona
    }

    @Then("se muestra el formulario correspondiente para {string}")
    public void redirigirAPantallaRegistro(String tipoPersona) {
        System.out.println("Then se redirige a la pantalla de registro para " + tipoPersona);
    }

}
