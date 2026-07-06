package com.example.steps.recuperacionContrasena;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * Reemplaza a recuperacionContrasenaJuridicaSteps.java y
 * recuperacionContrasenaNaturalSteps.java, que tenían EXACTAMENTE el mismo
 * texto en su Given ("el usuario está en la pantalla de inicio de sesión")
 * y su When ("hace clic en {string}") -> ambiguo entre sí, y además
 * ambiguo con botonRegistroJSteps/N y ComunSteps.
 *
 * El Given y el When ya están cubiertos por ComunSteps
 * (el usuario está en la página de inicio de sesión / hace clic en {string}).
 * Aquí solo queda el Then, que sí es distinto entre Natural y Jurídica.
 */
public class RecuperacionContrasenaSteps {
    @Given("el usuario está en la pantalla de inicio de sesión para recuperar la contrasena")
    public void el_usuario_esta_en_la_pantalla_de_inicio_de_sesion_para_recuperar_la_contrasena() {
    }

    @When("hace clic en la opcion {string} para recuperar la contraseña")
    public void hace_clic_en_la_opcion_para_recuperar_la_contrasena(String opcion) {
    }

    @When("hace clic en el enlace {string} para recuperar la contraseña")
    public void hace_clic_en_el_enlace_para_recuperar_la_contrasena(String enlace) {
    }

    @Then("se muestra el flujo de recuperación de contraseña para {string}")
    public void se_muestra_el_flujo_de_recuperacion_de_contrasena_para(String tipoUsuario) {
    }
}
