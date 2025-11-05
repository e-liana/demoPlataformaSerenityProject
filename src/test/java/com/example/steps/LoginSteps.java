package com.example.steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnLogin() {
        // Navegar a index.html
    }

    @When("ingresa usuario y contraseña válidos")
    public void ingresarCredenciales() {
        // Ingresar datos en el formulario
    }

    @Then("accede correctamente a la plataforma")
    public void accesoExitoso() {
        // Verificar acceso
    }
}
