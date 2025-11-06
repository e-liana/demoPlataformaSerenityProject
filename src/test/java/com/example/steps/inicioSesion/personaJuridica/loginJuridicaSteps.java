package com.example.steps.inicioSesion.personaJuridica;

import io.cucumber.java.en.*;

public class loginJuridicaSteps {

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnPaginaInicioSesion() {
        System.out.println("Given: el usuario está en la página de inicio de sesión");
        // TODO: navegar a la URL de login
    }

    @And("selecciona {string}")
    public void seleccionaTipoUsuario(String tipo) {
        System.out.println("And: selecciona -> " + tipo);
        // TODO: seleccionar la opción "Persona jurídica"
    }

    @When("ingresa NIT {string}, correo {string} y contraseña {string}")
    public void ingresaNitCorreoContrasena(String nit, String correo, String contrasena) {
        System.out.println("When: ingresa NIT=" + nit + " correo=" + correo);
        // TODO: usar PageObject para ingresar NIT, correo y contraseña
    }

    @And("hace clic en {string}")
    public void haceClicEn(String boton) {
        System.out.println("And: hace clic en -> " + boton);
        // TODO: simular clic en botón "Ingresar"
    }

    @Then("accede correctamente a la plataforma")
    public void accedeCorrectamente() {
        System.out.println("Then: accede correctamente a la plataforma");
        // TODO: verificar navegación/dashbord para persona jurídica
    }
}
