package com.example.steps.recuperacionContrasena;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class recuperacionContrasenaGeneralSteps {

    @Given("el usuario está en la pantalla de inicio de sesión para recuperar la contrasena")
    public void usuarioEnPantallaInicioSesionRecuperarContrasen() {
        // Lógica para abrir la pantalla de inicio de sesión
    }

    @When("hace clic en la opcion {string}")
    public void haceClicEnTipoUsuario(String tipoUsuario) {
        // Lógica para seleccionar el tipo de usuario
        if (tipoUsuario.equalsIgnoreCase("Persona Jurídica")) {
            seleccionarPersonaJuridica();
        } else if (tipoUsuario.equalsIgnoreCase("Persona Natural")) {
            seleccionarPersonaNatural();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }

    @When("hace clic en el enlace {string}")
    public void haceClicEnEnlace(String enlace) {
        // Lógica para hacer clic en el enlace de recuperación
    }

    @Then("se muestra el flujo de recuperación de contraseña para {string}")
    public void seMuestraFlujoRecuperacion(String tipoUsuario) {
        // Validación de que se muestra el flujo correcto
        if (tipoUsuario.equalsIgnoreCase("Persona Jurídica")) {
            validarFlujoJuridico();
        } else if (tipoUsuario.equalsIgnoreCase("Persona Natural")) {
            validarFlujoNatural();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }

    // Métodos auxiliares
    private void seleccionarPersonaJuridica() {
        // Código para seleccionar opción jurídica
    }

    private void seleccionarPersonaNatural() {
        // Código para seleccionar opción natural
    }

    private void validarFlujoJuridico() {
        // Validación específica para persona jurídica
    }

    private void validarFlujoNatural() {
        // Validación específica para persona natural
    }
}
