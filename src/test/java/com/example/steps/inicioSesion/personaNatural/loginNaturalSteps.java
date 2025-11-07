// java
package com.example.steps.inicioSesion.personaNatural;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginNaturalSteps {

    @Given("el usuario Natural está en la página de inicio de sesión")
    public void usuarioNaturalEnPaginaInicioSesion() {
        // TODO: navegar a la URL de login (usar WebDriver o PageObject)
        System.out.println("Given: el usuario Natural está en la página de inicio de sesión");
    }

    @And("selecciona {string}")
    public void seleccionaTipoUsuario(String tipo) {
        // TODO: seleccionar la opción "Persona natural" en la UI
        System.out.println("And: selecciona -> " + tipo);
    }

    @When("ingresa correo {string} y contraseña {string}")
    public void ingresaCorreoYContrasena(String correo, String contrasena) {
        // TODO: usar PageObject para completar correo y contraseña
        System.out.println("When: ingresa correo=" + correo + " contraseña=" + contrasena);
    }

    @And("natural hace clic en {string}")
    public void haceClicEnNatural(String boton) {
        // TODO: simular clic en el botón (p. ej. "Ingresar")
        System.out.println("And: hace clic en -> " + boton);
    }

    @Then("accede correctamente a la plataforma")
    public void accedeCorrectamente() {
        // TODO: validar que el usuario fue autenticado y redirigido (dashboard, token, etc.)
        System.out.println("Then: accede correctamente a la plataforma");
    }

}