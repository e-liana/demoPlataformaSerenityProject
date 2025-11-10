package com.example.steps.registro;


import io.cucumber.java.en.*;


public class validacion2Steps {


        @Given("el usuario está en el campo de contraseña")
        public void elUsuarioEstaEnElCampoDeContrasena() {
            // Lógica para navegar al campo de contraseña
        }

        @When("ingresa {string}")
        public void ingresaContrasena(String contrasena) {
            // Lógica para ingresar la contraseña
        }

        @Then("el sistema acepta la contraseña como válida")
        public void elSistemaAceptaLaContrasenaComoValida() {
            // Verificación de aceptación de contraseña válida
        }

        @Then("el sistema muestra error indicando falta de carácter especial")
        public void elSistemaMuestraErrorPorFaltaDeCaracterEspecial() {
            // Verificación del mensaje de error por contraseña inválida
        }
}



