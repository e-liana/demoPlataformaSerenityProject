package com.example.steps.registro;

import io.cucumber.java.en.Then;

/**
 * El Given "el usuario está en la pantalla de bienvenida" se movió a
 * ComunSteps (estaba duplicado con seleccionTipoPersonaSteps).
 *
 * El When de clic en "Cancelar" también se eliminó de aquí: el .feature
 * usa hace clic en el botón "Cancelar" (con comillas -> {string}), que ya
 * lo resuelve BotonRegistroSteps.haceClicEnElBoton(String). La versión que
 * había aquí (sin comillas, texto fijo "Cancelar") nunca hacía match con
 * el .feature real y quedaba como código muerto.
 */
public class cancelarRegistroSteps {

    @Then("el sistema lo redirige a la pantalla de inicio de sesión")
    public void redireccionInicioSesion() {
        System.out.println("Then: el sistema lo redirige a la pantalla de inicio de sesión");
        // TODO: assert real (URL/elemento visible del login)
    }
}
