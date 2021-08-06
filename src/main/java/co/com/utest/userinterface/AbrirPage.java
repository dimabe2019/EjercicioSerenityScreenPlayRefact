package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.utest.util.Constante.URL;

@DefaultUrl(URL)
public class AbrirPage extends PageObject {

    public static final Target REGISTRO_BTN = Target.the("Boton para iniciar el formulario de registro").located(By.linkText("Join Today"));

}
