// java
package com.example.steps.registro;

import io.cucumber.java.en.*;

public class validaciones_formularioSteps {

    @Given("el usuario está en el formulario de registro paso 1 de 2")
    public void usuarioEnFormularioRegistro() {
        System.out.println("Given: usuario en el formulario de registro paso 1 de 2");
        // TODO: navegar al formulario de registro
    }

    @When("^ingresa (.+), (.+) y selecciona (.+)$")
    public void ingresaCampos(String email, String contrasena, String ciudad) {
        System.out.println("When: ingresa -> email: " + email + ", contraseña: " + contrasena + ", ciudad: " + ciudad);
        // TODO: ingresar email, contraseña y seleccionar ciudad en el formulario
    }

    @Then("^el sistema valida los campos y muestra (.+)$")
    public void sistemaValidaYmuestraResultado(String resultado) {
        System.out.println("Then: resultado esperado -> " + resultado);
        // TODO: validar mensajes/estado según 'resultado'
    }

    @Given("el usuario está en el campo de contraseña")
    public void usuarioEnCampoContrasena() {
        System.out.println("Given: usuario en el campo de contraseña");
        // TODO: enfocar o navegar al campo de contraseña
    }

    @When("ingresa {string}")
    public void ingresaContrasena(String contrasena) {
        System.out.println("When: ingresa contraseña -> " + contrasena);
        // TODO: ingresar la contraseña en el campo
    }

    @Then("el sistema acepta la contraseña como válida")
    public void sistemaAceptaContrasenaValida() {
        System.out.println("Then: sistema acepta la contraseña como válida");
        // TODO: assert que la contraseña fue aceptada
    }

    @Then("el sistema muestra error indicando falta de carácter especial")
    public void sistemaMuestraErrorFaltaCaracterEspecial() {
        System.out.println("Then: error por falta de carácter especial");
        // TODO: assert que se muestra el error correspondiente
    }
}
