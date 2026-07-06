package com.example.steps.inicioSesion;

import com.example.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;

/**
 * Reemplaza a loginNaturalSteps.java y loginJuridicaSteps.java.
 *
 * Antes existían dos clases casi idénticas (una por tipo de persona) con:
 *  - Given duplicado con texto distinto al del .feature (steps "undefined")
 *  - "selecciona {string}" y "accede correctamente a la plataforma"
 *    definidos en ambas clases -> AmbiguousStepDefinitionsException
 *  - un bug cruzado: loginNatural.feature llamaba "juridica hace clic en..."
 *    y loginJuridica.feature llamaba "natural hace clic en...", ejecutando
 *    el método equivocado (o ninguno, por no coincidir el texto exacto).
 *
 * Solución: un solo step "When ingresa correo ... y contraseña ..." (PN) y
 * uno para PJ que además pide NIT. El resto (Given de la página, selección
 * de tipo de persona, clic en botones y verificación de acceso) vive en
 * ComunSteps porque es idéntico para ambos tipos de persona.
 */
public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @When("ingresa correo {string} y contraseña {string}")
    public void ingresaCorreoYContrasena(String correo, String contrasena) {
        loginPage.ingresarCorreoYContrasena(correo, contrasena);
    }

    @And("ingresa NIT {string}, correo {string} y contraseña {string}")
    public void ingresaNitCorreoYContrasena(String nit, String correo, String contrasena) {
        loginPage.ingresarNitCorreoYContrasena(nit, correo, contrasena);
    }
}
