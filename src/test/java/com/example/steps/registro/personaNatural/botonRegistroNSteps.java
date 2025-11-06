package com.example.steps.registro.personaNatural;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class botonRegistroNSteps {

    @Given("el usuario está en la pantalla de inicio de sesión")
    public void usuarioEnPantallaInicio() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");

    }

    @Given("el usuario accesa al registro desde la pantalla de inicio")
    public void usuarioIngresaRegistroDesdeInicio() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");
        // lógica para navegar a la pantalla de inicio de sesión
    }

    @When("hace clic en el botón {string}")
    public void haceClicEnBoton(String boton) {
        // lógica para hacer clic en botones como "Regístrate", "Cancelar"
    }

    @Then("se muestra la pantalla de bienvenida con opciones de tipo de persona")
    public void mostrarPantallaBievenidaTipoPersona() {
        System.out.println("Then ese muestra la pantalla de bienvenida con opciones de tipo de persona");
        // verificación de redirección
    }

}
