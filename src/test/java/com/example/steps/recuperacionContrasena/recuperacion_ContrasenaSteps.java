package com.example.steps.recuperacionContrasena;

import io.cucumber.java.en.*;


public class recuperacion_ContrasenaSteps {

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnLogin() {
        System.out.println("entro al Given");// Navegar a index.html
    }

    @When("hace clic en Persona Natural")
    public void seleccionPersonaNatural() {
        System.out.println("entro al When ");// Entro al when -caso de uso de persona natural
    }

    @And("hace clic en ¿Olvidaste tu contraseña?")
    public void seleccionOlvidoContraseña() {
        System.out.println("entro al And ");// Entro al And - seleccion olvido contraseña entro al And
    }

    @Then("se muestra el flujo de recuperación de contraseña para persona jurídica")
    public void recibeInstruccionesRestablecerContraseñaNatural() {
        System.out.println("entro al Then"); // Verificar acceso
    }

}
