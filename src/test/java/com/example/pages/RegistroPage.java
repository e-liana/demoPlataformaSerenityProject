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

   // private static final String XPATH_BOTON_POR_TEXTO = "//button[normalize-space(text())='%s']";

    /**
     * Selector genérico para botones cuyo texto puede estar
     * dentro de spans, iconos u otros elementos hijos.
     */
    private static final String XPATH_BOTON_POR_TEXTO =
            "//button[contains(normalize-space(.), '%s')]";

    private static final String XPATH_POR_TEXTO = "//*[normalize-space(text())='%s']";

    // TODO: reemplazar por el selector real del pop-up de confirmación de datos
    // #modalValidAccesData > div > div
    // class="modal-content tw-p-8 tw-w-full tw-overflow-y-auto tw-max-h-[90vh]"
    //private static final By POPUP_CONFIRMACION = By.cssSelector("#modalValidAccesData > div > div");
    private static final By POPUP_CONFIRMACION =
            By.xpath("//h3[contains(text(),'Por favor confirma tus datos')]");

    private static final By BTN_CANCELAR =
            By.xpath("//button[@ng-click='BackToLogin()']");

    private static final By LINK_REGISTRATE =
            By.xpath("//a[@ng-click='SignUp();']");


    // campos ID formulario ingreso

    private static final By TXT_NOMBRES = By.id("txtFirstName");
    private static final By TXT_APELLIDOS = By.id("txtLastName");
    private static final By TXT_DOCUMENTO = By.id("txtDocNumber");
    private static final By TXT_CELULAR = By.id("cellPhoneOne");
    private static final By TXT_CORREO = By.id("txtEmail");
    private static final By TXT_PASSWORD = By.id("txtPassword");
    private static final By TXT_PASSWORD_CONFIRM = By.id("txtPasswordConfirm");
    private static final By TXT_CIUDAD = By.id("city");
    private static final By TXT_VIA = By.id("txtTrack");
    private static final By TXT_SEGUNDO_NUMERO = By.id("txtSecondNumber");
    private static final By TXT_PLACA = By.id("txtPlate");
    private static final By SELECT_TIPO_DOCUMENTO = By.id("typeId");


    // TODO: reemplazar por el selector real del input del código OTP
    // body > div:nth-child(3) > div > div > div > div > div > div > div > div.tw-px-2.scrollable > div > div.tw-mb-7.tw-p-1.tw-roundedtw-bg-card.tw-rounded-md > form
    // tw-flex tw-gap-5 tw-justify-between ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength
    private static final By CAMPO_CODIGO_VERIFICACION = By.id("body > div:nth-child(3) > div > div > div > div > div > div > div > div.tw-px-2.scrollable > div > div.tw-mb-7.tw-p-1.tw-roundedtw-bg-card.tw-rounded-md > form");

    public boolean estaEnPantallaInicioSesion() {
        return getDriver().getCurrentUrl().contains("fisapay.com.co");
    }

    /*
    public void clicEnBoton(String textoBoton) {
        $(By.xpath(String.format(XPATH_BOTON_POR_TEXTO, textoBoton))).click();
    }
*/


    /**
     * Hace clic en un botón por su texto visible.
     *
     * Ejemplos:
     * - Cancelar
     * - Continuar
     * - Registrarme
     */
    public void clicEnBoton(String textoBoton) {

        String xpath = String.format(
                XPATH_BOTON_POR_TEXTO,
                textoBoton
        );

        System.out.println("Texto recibido: " + textoBoton);
        System.out.println("XPath utilizado: " + xpath);

        $(By.xpath(xpath))
                .waitUntilClickable()
                .click();
    }



    public void clicEnCancelar() {
        $(BTN_CANCELAR)
                .waitUntilClickable()
                .click();
    }

    public void clicEnRegistrate() {
        $(LINK_REGISTRATE)
                .waitUntilClickable()
                .click();
    }



    public void clicEnOpcion(String texto) {
        $(By.xpath(String.format(XPATH_POR_TEXTO, texto))).click();
    }

    public boolean seMuestraPantallaBienvenidaTipoPersona() {
        return isElementVisible(By.xpath(String.format(XPATH_POR_TEXTO, "Persona Natural")))
                && isElementVisible(By.xpath(String.format(XPATH_POR_TEXTO, "Persona Jurídica")));
    }

  /*  public boolean popupConfirmacionVisible() {
        return $(POPUP_CONFIRMACION).isCurrentlyVisible();
    }
*/

    public boolean popupConfirmacionVisible() {

        try {

            $(POPUP_CONFIRMACION)
                    .waitUntilVisible();

            return true;

        } catch (Exception e) {

            return false;
        }
    }
    public void ingresarCodigoVerificacion(String codigo) {
        $(CAMPO_CODIGO_VERIFICACION).waitUntilVisible().type(codigo);
    }
}
