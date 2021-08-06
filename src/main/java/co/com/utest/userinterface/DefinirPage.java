package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DefinirPage extends PageObject {
    public static final Target SO_INPUT = Target.the("Campo para el sistema operativo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SO_SELECT = Target.the("Sistema operativo seleccionado").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]");
    public static final Target VERSION_INPUT = Target.the("Campo para la version del so").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target VERSION_SELECT = Target.the("version seleccionada").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target LENGUAJESO_INPUT = Target.the("campo para el lenguaje del so").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span");
    public static final Target LENGUAJESO_SELECT = Target.the("lenguaje seleccionado").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]");
    public static final Target MARCAMOBIL_INPUT = Target.the("Campo para la marca del celular").locatedBy("//span[contains(text(),'Select Brand')]");
    public static final Target MARCAMOBIL_SELECT = Target.the("marca del celular seleccionado").locatedBy("//input[@placeholder='Select Brand']");
    public static final Target MODELOMOBIL_INPUT = Target.the("Campo para el modelo del mobil").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target MODELOMOBIL_SELECT = Target.the("Modelo seleccionado").locatedBy("//input[@placeholder='Select a Model']");
    public static final Target SOMOBIL_INPUT = Target.the("Campo para el sistema operativo del mobil").locatedBy("//span[@class='ui-select-placeholder text-muted']");
    public static final Target SOMOBIL_SELECT = Target.the("Sistema operativo del mobil seleccionado").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]");
    public static final Target NEXT3_BUTTON = Target.the("Boton para continuar el formulario").located(By.xpath("//a[@aria-label='Next - final step']"));
}
