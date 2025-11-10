package com.example.steps.registro;
import io.cucumber.java.en.*;

public class verificacionSMSSteps {


        @Given("el usuario está en la pantalla de verificación")
        public void elUsuarioEstaEnPantallaDeVerificacion() {
           //# verificacion.usuarioEnPantallaVerificacion();
        }

        @When("el sistema envía el código al número registrado")
        public void elSistemaEnviaCodigo() {
           // verificacion.sistemaEnviaCodigo();
        }

        @Then("el usuario puede ingresar el código para continuar")
        public void elUsuarioIngresaCodigo() {
           // verificacion.usuarioIngresaCodigo();
        }

        @Given("el usuario espera 59 segundos")
        public void elUsuarioEspera59Segundos() throws InterruptedException {
           // verificacion.usuarioEspera59Segundos();
        }

        @When("hace clic en \\\"Reenviar código\\\"")
        public void haceClicEnReenviarCodigo() {
          //  verificacion.clicEnReenviarCodigo();
        }

        @Then("el sistema envía un nuevo código al número registrado")
        public void elSistemaEnviaNuevoCodigo() {
          //  verificacion.sistemaEnviaNuevoCodigo();
        }
    }


