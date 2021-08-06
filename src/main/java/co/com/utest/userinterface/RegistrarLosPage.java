package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarLosPage extends PageObject {
    public static final Target NOMBRE_INPUT = Target.the("Campo para ingresar el nombre").located(By.id("firstName"));
    public static final Target APELLIDO_INPUT = Target.the("Campo para ingresar el apellido").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Campo para ingresar el email").located(By.id("email"));
    public static final Target MES_INPUT = Target.the("campo para seleccionar el mes").located(By.id("birthMonth"));
    public static final Target DIA_INPUT = Target.the("campo para seleccionar el dia").located(By.id("birthDay"));
    public static final Target ANIO_INPUT = Target.the("campo para seleccionar el año").located(By.id("birthYear"));
    public static final Target IDIOMA_INPUT = Target.the("Campo para seleccionar el lenguaje").located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target IDIOMA_SELECT = Target.the("lenguaje seleccionado").located(By.xpath("//div[contains(text(),'Spanish')]"));
    public static final Target NEXT_BUTTON = Target.the("Boton para el siguiente paso").located(By.xpath("//a[@role='button']"));
}
