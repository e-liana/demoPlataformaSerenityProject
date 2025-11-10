package com.example.steps.recuperacionContrasena;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class recuperacionContrasenaGeneralSteps {

    @Given("el usuario está en la pantalla de inicio de sesión para recuperar la contrasena")
    public void usuarioEnPantallaInicioSesionRecuperarContrasena() {
        // Lógica para abrir la pantalla de inicio de sesión
    }


    // separacion de tipo de persona para recuperacion de contrasena para que cucumber lo identifique como unico y evitar error recurrente
    @When("hace clic en la opcion {string} para recuperar la contraseña")
    public void haceClicEnTipoUsuarioRecuperacionContrasea(String tipoUsuario) {
        // Lógica para seleccionar el tipo de usuario
        if (tipoUsuario.equalsIgnoreCase("Persona Jurídica")) {
            seleccionarPersonaJuridica();
        } else if (tipoUsuario.equalsIgnoreCase("Persona Natural")) {
            seleccionarPersonaNatural();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }

    @When("hace clic en el enlace {string} para recuperar la contraseña")
    public void haceClicEnEnlaceRecuperarContrasena(String enlace) {
        // Lógica para hacer clic en el enlace de recuperación
    }

    @Then("se muestra el flujo de recuperación de contraseña para {string}")
    public void seMuestraFlujoRecuperacionUsuario(String tipoUsuario) {
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
