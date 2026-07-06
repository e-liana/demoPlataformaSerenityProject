package com.example.steps.registro;

import com.example.pages.RegistroPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

/**

 *
 * El botón "Regístrate"/"Cancelar" se comporta igual sin importar si luego
 * el usuario elige Persona Natural o Jurídica, así que un solo set de
 * steps sirve para ambos features (botonRegistroN.feature y botonRegistroJ.feature).
 *
 * El Given "el usuario está en la pantalla de inicio de sesión" se movió a
 * ComunSteps (unificado como "página de inicio de sesión").
 */
public class BotonRegistroSteps {

    @Steps
    RegistroPage registroPage;

    @When("hace clic en el botón {string}")
    public void haceClicEnElBoton(String boton) {
        registroPage.clicEnBoton(boton);
    }

    @Then("se muestra la pantalla de bienvenida con opciones de tipo de persona")
    public void seMuestraPantallaBienvenidaConOpcionesDeTipoDePersona() {
        Assert.assertTrue(
            "No se muestran las opciones de tipo de persona (Natural/Jurídica)",
            registroPage.seMuestraPantallaBienvenidaTipoPersona()
        );
    }
}
