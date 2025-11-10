package com.example.steps.inicioSesion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class loginGeneralSteps {

    @Given("el usuario está en la página de inicio de sesión para ingresar")
    public void usuarioEnPaginaInicioSesionIngreso() {
        // Lógica para abrir la página de login
    }

    @Given("selecciona {string} para login")
    public void seleccionaTipoUsuarioLogin(String tipoUsuario) {
        // Lógica para seleccionar tipo de usuario
        if (tipoUsuario.equalsIgnoreCase("Persona jurídica")) {
            seleccionarPersonaJuridicaInicio();
        } else if (tipoUsuario.equalsIgnoreCase("Persona natural")) {
            seleccionarPersonaNaturalInicio();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }
    }
// revisar logica para credenciales, o definir si se puede mandar a un inicio de sesion por tipo de usuario desde aca
    @When("ingresa credenciales necesarias para login {string}")
    public void ingresaCredencialesNecesariasLogin(String credenciales) {
        if (credenciales.contains("NIT")) {
            // Parsear y usar NIT, correo y contraseña
            ingresarCredencialesJuridicaInicio(credenciales);
        } else {
            // Parsear y usar correo y contraseña
            ingresarCredencialesNaturalInicio(credenciales);
        }
    }

// parte del AND - Boton ingresar se  comparte en ambas logicas
    @When("hace clic en el botón {string}")
    public void haceClicEnBotonIngreso(String boton)
    {
        // Lógica para hacer clic en el botón
    }

    @Then("accede correctamente a la plataforma desde Inicio de sesión")
    public void accedeCorrectamenteInicioSesion() {
        // Validación de acceso exitoso
    }

    // Métodos auxiliares
    private void seleccionarPersonaJuridicaInicio() {
        // Código para seleccionar opción jurídica
    }

    private void seleccionarPersonaNaturalInicio() {
        // Código para seleccionar opción natural
    }

    private void ingresarCredencialesJuridicaInicio(String datos) {
        // Extraer NIT, correo y contraseña del string y usarlos
    }

    private void ingresarCredencialesNaturalInicio(String datos) {
        // Extraer correo y contraseña del string y usarlos
    }
}
