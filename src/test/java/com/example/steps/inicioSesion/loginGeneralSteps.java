package com.example.steps.inicioSesion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class loginGeneralSteps {

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnPaginaInicioSesion() {
        // Lógica para abrir la página de login
    }

    @Given("selecciona {string} para login")
    public void seleccionaTipoUsuarioLogin(String tipoUsuario) {
        // Lógica para seleccionar tipo de usuario
        if (tipoUsuario.equalsIgnoreCase("Persona jurídica")) {
            seleccionarPersonaJuridica();
        } else if (tipoUsuario.equalsIgnoreCase("Persona natural")) {
            seleccionarPersonaNatural();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }

    @When("ingresa credenciales necesarias para login {string}")
    public void ingresaCredencialesNecesariasLogin(String credenciales) {
        if (credenciales.contains("NIT")) {
            // Parsear y usar NIT, correo y contraseña
            ingresarCredencialesJuridica(credenciales);
        } else {
            // Parsear y usar correo y contraseña
            ingresarCredencialesNatural(credenciales);
        }
    }


    @When("hace clic en el botón {string}")
    public void haceClicEnBotonIngreso(String boton)
    {
        // Lógica para hacer clic en el botón
    }

    @Then("accede correctamente a la plataforma")
    public void accedeCorrectamente() {
        // Validación de acceso exitoso
    }

    // Métodos auxiliares
    private void seleccionarPersonaJuridica() {
        // Código para seleccionar opción jurídica
    }

    private void seleccionarPersonaNatural() {
        // Código para seleccionar opción natural
    }

    private void ingresarCredencialesJuridica(String datos) {
        // Extraer NIT, correo y contraseña del string y usarlos
    }

    private void ingresarCredencialesNatural(String datos) {
        // Extraer correo y contraseña del string y usarlos
    }
}
