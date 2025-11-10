package com.example.steps.registro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class seleccionPersonaRegistroSteps {
/* Given del escneario de background, que es igual al given inicial, mejorar planteamiento

    @Given("El usuario se encuentra en la pantalla de Bienvenida al proceso de Registro")
    public void usuarioEnPantallaDeBienvenidaRegistro() {
        // Lógica para asegurar que el usuario está en la pantalla de bienvenida
        System.out.println("entro al Given, usuario en pagina de registro");
    }
*/
    @Given("el usuario está en la pantalla de bienvenida al proceso de registro")
    public void usuarioEstaEnPantallaDeBienvenidaRegistrarse() {
        // Lógica para verificar o simular que el usuario está en la pantalla de bienvenida
    }

    @When("selecciona {string} para registrarse")
    public void seleccionaTipoPersonaParaRegistrarse(String tipoPersona) {
        // Lógica para seleccionar el tipo de persona (ej. "Persona Natural" o "Persona Jurídica")
    }

    @Then("se muestra el formulario correspondiente para registro {string}")
    public void seMuestraFormularioRegistroCorrespondiente(String tipoPersona) {
        // Lógica para verificar que se muestra el formulario correcto según el tipo de persona
    }

}
