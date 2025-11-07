package com.example.steps.registro.personaNatural;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class botonRegistroNSteps {

    @Given("el usuario Natural está en la pantalla de inicio de sesión para registrarse")
    public void usuarioEnPantallaInicioRegistroN() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");

    }

    @Given("el usuario Natural accesa al registro desde la pantalla de inicio")
    public void usuarioIngresaRegistroDesdeInicioN() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");
        // lógica para navegar a la pantalla de inicio de sesión
    }

    @When("hace clic en el botón {string} en la pantalla de inicio para registrarse como Natural")
    public void haceClicEnBotonRegistrarN(String boton) {
        // lógica para hacer clic en botones como "Regístrate", "Cancelar"
    }

    @Then("se muestra la pantalla de bienvenida con opciones de tipo de persona Natural")
    public void mostrarPantallaBievenidaTipoPersonaN() {
        System.out.println("Then ese muestra la pantalla de bienvenida con opciones de tipo de persona");
        // verificación de redirección
    }

}
