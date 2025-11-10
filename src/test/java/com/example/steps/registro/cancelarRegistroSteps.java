package com.example.steps.registro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cancelarRegistroSteps {


    @Given("el usuario está en la pantalla de Registro")
    public void elUsuarioEstaEnLaPantallaDeInicioDeSesion() {
        // Lógica para navegar a la pantalla de inicio de sesion desde la pagina de registro y su cancelacion
        System.out.println("entro al Given, usuario en pagina de registro");
    }

    @Given("el usuario está en la pantalla de bienvenida y decide cancelar el registro")
    public void elUsuarioEstaEnLaPantallaDeBienvenidaYDecideCancelar() {
        // Lógica para simular que el usuario está en la pantalla de bienvenida
        System.out.println("entro al Given");//  pantalla de bienvenida en el proceso de registro
    }

    @When("hace clic en el botón {string} desde la pantalla de bienvenida")
    public void haceClicEnElBotonCancelarDesdeLaPantallaDeBienvenida(String boton) {
        // Lógica para hacer clic en el botón especificado (por ejemplo, "Cancelar")
        System.out.println("entro al When");//
    }

    @Then("el sistema cancela el registro y lo redirige a la pantalla de inicio de sesión")
    public void elSistemaCancelaElRegistroYRedirige() {
        // Lógica para verificar que el usuario fue redirigido correctamente
        System.out.println("entro al Then");// regresa a pantalla de inicio/ inicio sesin independientemente del tipo de persona
    }

}
