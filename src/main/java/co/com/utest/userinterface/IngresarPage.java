package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarPage extends PageObject {
    public static final Target CIUDAD_INPUT = Target.the("Campo para la ciudad").located(By.id("city"));
    public static final Target CODPOSTAL_INPUT = Target.the("Campo para el codigo postal").located(By.id("zip"));
    public static final Target PAIS_INPUT = Target.the("Campo para seleccionar el pais").located(By.name("countryId"));
    public static final Target PAIS_SELECT = Target.the("pais seleccionado").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target NEXT2_BUTTON = Target.the("Boton para continuar al siguiente paso").located(By.xpath("//a[@aria-label='Next step - select your devices']"));
}
