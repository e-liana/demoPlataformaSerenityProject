package com.example.steps.registro.personaJuridica;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class botonRegistroJSteps {

    @Given("el usuario está en la pantalla de inicio de sesión para registrarse")
    public void usuarioEnPantallaInicioRegistro() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");

    }

    @Given("el usuario Juridico accesa al registro desde la pantalla de inicio para registrarse")
    public void usuarioIngresaRegistroDesdeInicioJ() {
        System.out.println("Given el usuario está en la pantalla de inicio de sesión");
        // lógica para navegar a la pantalla de inicio de sesión
    }

    @When("hace clic en el botón {string} para registrarse como Juridico")
    public void haceClicEnBotonRegistrarJ(String boton) {
        // lógica para hacer clic en botones como "Regístrate", "Cancelar"
    }

    @Then("se muestra la pantalla de bienvenida con opciones de tipo de persona Juridica")
    public void mostrarPantallaBievenidaTipoPersonaJ() {
        System.out.println("Then ese muestra la pantalla de bienvenida con opciones de tipo de persona");
        // verificación de redirección
    }

}
