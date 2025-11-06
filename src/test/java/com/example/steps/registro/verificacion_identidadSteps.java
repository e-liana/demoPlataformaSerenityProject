package com.example.steps.registro;

import io.cucumber.java.en.*;

public class verificacion_identidadSteps {

    @Given("el usuario ha completado el formulario de registro")
    public void usuarioHaCompletadoFormularioRegistro() {
        System.out.println("Given: el usuario ha completado el formulario de registro");
        // TODO: validar que el formulario esté completo / preparar estado
    }

    @When("se muestra el pop-up con cédula y correo")
    public void seMuestraPopupCedulaCorreo() {
        System.out.println("When: se muestra el pop-up con cédula y correo");
        // TODO: comprobar visibilidad del pop-up y sus datos
    }

    @And("el usuario hace clic en {string}")
    public void elUsuarioHaceClicEn(String boton) {
        System.out.println("And: el usuario hace clic en -> " + boton);
        // TODO: simular clic en el botón indicado (ej. "Confirmar")
    }

    @Then("el sistema procede al paso de verificación de identidad")
    public void sistemaProcedeAlPasoDeVerificacionDeIdentidad() {
        System.out.println("Then: el sistema procede al paso de verificación de identidad");
        // TODO: verificar navegación/estado hacia la pantalla de verificación
    }

    @Given("el usuario está en la pantalla de verificación")
    public void usuarioEstaEnPantallaDeVerificacion() {
        System.out.println("Given: el usuario está en la pantalla de verificación");
        // TODO: asegurar que la pantalla de verificación está activa
    }

    @When("el sistema envía el código al número registrado")
    public void sistemaEnviaCodigoAlNumeroRegistrado() {
        System.out.println("When: el sistema envía el código al número registrado");
        // TODO: validar envío de SMS / mock del servicio
    }

    @Then("el usuario puede ingresar el código para continuar")
    public void usuarioPuedeIngresarElCodigoParaContinuar() {
        System.out.println("Then: el usuario puede ingresar el código para continuar");
        // TODO: verificar que el campo de código está habilitado y acepta entrada
    }

    @Given("el usuario espera 59 segundos")
    public void usuarioEspera59Segundos() {
        System.out.println("Given: el usuario espera 59 segundos");
        // TODO: simular espera o avanzar el reloj en tests
    }

    @When("hace clic en {string}")
    public void haceClicEn(String opcion) {
        System.out.println("When: hace clic en -> " + opcion);
        // TODO: simular clic en la opción indicada (ej. "Reenviar código")
    }

    @Then("el sistema envía un nuevo código al número registrado")
    public void sistemaEnviaUnNuevoCodigoAlNumeroRegistrado() {
        System.out.println("Then: el sistema envía un nuevo código al número registrado");
        // TODO: verificar que se intentó enviar un nuevo código
    }
}
