package com.example.steps.registro;

import io.cucumber.java.en.Then;

/**
 * El Given "el usuario está en la pantalla de bienvenida" y el
 * When "selecciona {string}" se movieron a ComunSteps (estaban
 * duplicados con cancelarRegistroSteps, loginNaturalSteps y
 * loginJuridicaSteps). Aquí solo queda el Then, que es único.
 */
public class seleccionTipoPersonaSteps {

    @Then("se muestra el formulario correspondiente para {string}")
    public void redirigirAPantallaRegistro(String tipoPersona) {
        System.out.println("Then se redirige a la pantalla de registro para " + tipoPersona);
        // TODO: assert real de que el formulario mostrado corresponde a tipoPersona
    }
}
