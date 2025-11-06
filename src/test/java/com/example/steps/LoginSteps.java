package com.example.steps;

import io.cucumber.java.en.*;

public class loginSteps {

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnLogin() {
        System.out.println("entro al Given");// Navegar a index.html
    }


    // validar si es necesario agregar la seleccion de persona natural y juridica antes del ingreso de credenciales

    @When("ingresa usuario y contraseña válidos")
    public void ingresarCredenciales() {
        System.out.println("entro al When ");// Ingresar datos en el formulario
    }

    @Then("accede correctamente a la plataforma")
    public void accesoExitoso() {
        System.out.println("entro al Then "); // Verificar acceso
    }
}
