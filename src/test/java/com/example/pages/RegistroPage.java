package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
//import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Page Object del flujo de registro (Persona Natural y Persona Jurídica).
 * Un solo Page Object reutilizable por tipo de persona, en vez de
 * duplicar botones/campos entre PN y PJ.
 *
 * IMPORTANTE: locators son PLACEHOLDERS, ver instrucciones en LoginPage.java.
 */
@DefaultUrl("https://pruebas.fisapay.com.co/")
public class RegistroPage extends PageObject {

    private static final String XPATH_BOTON_POR_TEXTO = "//button[normalize-space(text())='%s']";
    private static final String XPATH_POR_TEXTO = "//*[normalize-space(text())='%s']";

    // TODO: reemplazar por el selector real del pop-up de confirmación de datos
    // #modalValidAccesData > div > div
    // class="modal-content tw-p-8 tw-w-full tw-overflow-y-auto tw-max-h-[90vh]"
    private static final By POPUP_CONFIRMACION = By.cssSelector("#modalValidAccesData > div > div");

    // TODO: reemplazar por el selector real del input del código OTP
    // body > div:nth-child(3) > div > div > div > div > div > div > div > div.tw-px-2.scrollable > div > div.tw-mb-7.tw-p-1.tw-roundedtw-bg-card.tw-rounded-md > form
    // tw-flex tw-gap-5 tw-justify-between ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength
    private static final By CAMPO_CODIGO_VERIFICACION = By.id("body > div:nth-child(3) > div > div > div > div > div > div > div > div.tw-px-2.scrollable > div > div.tw-mb-7.tw-p-1.tw-roundedtw-bg-card.tw-rounded-md > form");

    public boolean estaEnPantallaInicioSesion() {
        return getDriver().getCurrentUrl().contains("fisapay.com.co");
    }

    public void clicEnBoton(String textoBoton) {
        $(By.xpath(String.format(XPATH_BOTON_POR_TEXTO, textoBoton))).click();
    }

    public void clicEnOpcion(String texto) {
        $(By.xpath(String.format(XPATH_POR_TEXTO, texto))).click();
    }

    public boolean seMuestraPantallaBienvenidaTipoPersona() {
        return isElementVisible(By.xpath(String.format(XPATH_POR_TEXTO, "Persona Natural")))
                && isElementVisible(By.xpath(String.format(XPATH_POR_TEXTO, "Persona Jurídica")));
    }

    public boolean popupConfirmacionVisible() {
        return $(POPUP_CONFIRMACION).isCurrentlyVisible();
    }

    public void ingresarCodigoVerificacion(String codigo) {
        $(CAMPO_CODIGO_VERIFICACION).waitUntilVisible().type(codigo);
    }
}
