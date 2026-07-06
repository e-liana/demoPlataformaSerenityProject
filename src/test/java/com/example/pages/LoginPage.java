package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Page Object de la pantalla de inicio de sesión.
 * Sirve tanto para Persona Natural como Persona Jurídica.
 */
public class LoginPage extends PageObject {

    // Campo correo
    private static final By CAMPO_CORREO = By.id("txtEmail");

    // Campo contraseña
    private static final By CAMPO_CONTRASENA = By.id("txtPassword");

    // Campo NIT
    private static final By CAMPO_NIT = By.id("userNameNit");

    // Selector genérico por texto
    private static final String XPATH_POR_TEXTO =
            "//*[normalize-space(text())='%s']";

    /**
     * Abre la aplicación.
     */
    public void abrir() {
        getDriver().get("https://pruebas.fisapay.com.co/");
    }

    /**
     * Verifica que la página esté abierta.
     */
    public boolean estaAbierta() {
        return getDriver().getCurrentUrl().contains("fisapay.com.co");
    }

    /**
     * Selecciona Persona Natural o Persona Jurídica.
     */
    public void seleccionarTipoPersona(String tipoPersona) {
        $(By.xpath(String.format(XPATH_POR_TEXTO, tipoPersona)))
                .waitUntilClickable()
                .click();
    }

    /**
     * Persona Natural.
     */
    public void ingresarCorreoYContrasena(String correo, String contrasena) {

        $(CAMPO_CORREO)
                .waitUntilVisible()
                .clear();

        $(CAMPO_CORREO)
                .type(correo);

        $(CAMPO_CONTRASENA)
                .waitUntilVisible()
                .clear();

        $(CAMPO_CONTRASENA)
                .type(contrasena);
    }

    /**
     * Persona Jurídica.
     */
    public void ingresarNitCorreoYContrasena(String nit,
                                             String correo,
                                             String contrasena) {

        $(CAMPO_NIT)
                .waitUntilVisible()
                .clear();

        $(CAMPO_NIT)
                .type(nit);

        ingresarCorreoYContrasena(correo, contrasena);
    }

    /**
     * Hace clic en cualquier elemento visible por texto.
     * Funciona para botones, enlaces (<a>), spans, etc.
     */
    public void clicEnBoton(String texto) {

        String xpath = String.format(XPATH_POR_TEXTO, texto);

        System.out.println("Texto recibido: " + texto);
        System.out.println("XPath utilizado: " + xpath);

        $(By.xpath(xpath))
                .waitUntilClickable()
                .click();
    }
}


/* VERSION 2

package com.example.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Page Object de la pantalla de inicio de sesión.
 * Sirve tanto para Persona Natural como Persona Jurídica.
 */
/*
public class LoginPage extends PageObject {


    // Campo correo
    private static final By CAMPO_CORREO = By.id("txtEmail");

    // Campo contraseña
    private static final By CAMPO_CONTRASENA = By.id("txtPassword");

    // Campo NIT
    private static final By CAMPO_NIT = By.id("userNameNit");

    // Selectores dinámicos por texto
    private static final String XPATH_POR_TEXTO =
            "//*[normalize-space(text())='%s']";

    private static final String XPATH_BOTON_POR_TEXTO =
            "//button[normalize-space(text())='%s']";

    /**
     * Abre la aplicación.

    public void abrir() {
        getDriver().get("https://pruebas.fisapay.com.co/");
    }

    /**
     * Verifica que la página esté abierta.

    public boolean estaAbierta() {
        return getDriver().getCurrentUrl().contains("fisapay.com.co");
    }

    /**
     * Selecciona Persona Natural o Persona Jurídica.

    public void seleccionarTipoPersona(String tipoPersona) {
        $(By.xpath(String.format(XPATH_POR_TEXTO, tipoPersona)))
                .waitUntilClickable()
                .click();
    }

    /**
     * Persona Natural.

    public void ingresarCorreoYContrasena(String correo, String contrasena) {
        $(CAMPO_CORREO)
                .waitUntilVisible()
                .clear();

        $(CAMPO_CORREO)
                .type(correo);

        $(CAMPO_CONTRASENA)
                .waitUntilVisible()
                .clear();

        $(CAMPO_CONTRASENA)
                .type(contrasena);
    }
/*
    /**
     * Persona Jurídica.

    public void ingresarNitCorreoYContrasena(String nit,
                                             String correo,
                                             String contrasena) {

        $(CAMPO_NIT)
                .waitUntilVisible()
                .clear();

        $(CAMPO_NIT)
                .type(nit);

        ingresarCorreoYContrasena(correo, contrasena);
    }

    /**
     * Click en cualquier botón por texto.

    public void clicEnBoton(String textoBoton) {
        $(By.xpath(String.format(
                XPATH_BOTON_POR_TEXTO,
                textoBoton)))
                .waitUntilClickable()
                .click();
    }
}
/*

 */

//VERSION 1
/*

package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Page Object de la pantalla de inicio de sesión.
 * Sirve tanto para Persona Natural como Persona Jurídica: el tipo de
 * persona es un parámetro, no una clase distinta (evita duplicar código).
 *
 * IMPORTANTE: los locators de abajo son PLACEHOLDERS. Reemplázalos por los
 * reales inspeccionando https://pruebas.fisapay.com.co/#!/ con las DevTools:
 *  1. Clic derecho sobre el campo/botón -> "Inspeccionar".
 *  2. Copia el atributo id (preferido), name, o un selector css estable.
 *  3. Reemplaza el valor dentro de By.id("...") / el patrón xpath.
 */

/*
@DefaultUrl("https://pruebas.fisapay.com.co/") // se concatena con webdriver.base.url definido en serenity.properties
public class LoginPage extends PageObject {

    // TODO: reemplazar por el id/name real del input de correo
    // // id="txtEmail"
    // /html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div/div/div/div[2]/form/div[1]/div[2]/mat-textfield/div/input
    private static final By CAMPO_CORREO = By.id("txtEmail");


    // TODO: reemplazar por el id/name real del input de contraseña
    //// id="txtPassword"
    /// /html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div/div/div/div[2]/form/div[1]/div[3]/mat-textfield/div/input
    private static final By CAMPO_CONTRASENA = By.id("txtPassword");

    // TODO: reemplazar por el id/name real del input de NIT (solo Persona Jurídica)
    // id="userNameNit"
    // /html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div/div/div/div[2]/form/div[1]/div[1]/mat-textfield/div/input
    private static final By CAMPO_NIT = By.id("userNameNit");

    // Patrones xpath parametrizables por texto visible (útiles mientras no
    // haya id/name estables en el HTML). Sustituir por selectores fijos
    // en cuanto se conozcan los atributos reales del DOM.
    private static final String XPATH_POR_TEXTO = "//*[normalize-space(text())='%s']";
    private static final String XPATH_BOTON_POR_TEXTO = "//button[normalize-space(text())='%s']";

    public void abrir() {
        getDriver().get("https://pruebas.fisapay.com.co/");
        open();
    }

    public boolean estaAbierta() {
        return getDriver().getCurrentUrl().contains("fisapay.com.co");
    }

    public void seleccionarTipoPersona(String tipoPersona) {
        $(By.xpath(String.format(XPATH_POR_TEXTO, tipoPersona))).click();
    }

    public void ingresarCorreoYContrasena(String correo, String contrasena) {
        $(CAMPO_CORREO).waitUntilVisible().type(correo);
        $(CAMPO_CONTRASENA).type(contrasena);
    }

    public void ingresarNitCorreoYContrasena(String nit, String correo, String contrasena) {
        $(CAMPO_NIT).waitUntilVisible().type(nit);
        ingresarCorreoYContrasena(correo, contrasena);
    }

    public void clicEnBoton(String textoBoton) {
        $(By.xpath(String.format(XPATH_BOTON_POR_TEXTO, textoBoton))).click();
    }
}
*/