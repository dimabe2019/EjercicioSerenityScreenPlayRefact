package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GenerarPage extends PageObject {
    public static final Target PASSWORD_INPUT = Target.the("Campo para la contraseña").located(By.id("password"));
    public static final Target CONFIRMPASSWORD_INPUT = Target.the("Campo para la confirmar la contraseña").located(By.id("confirmPassword"));
    public static final Target MANTENERINFO_CHECK = Target.the("Checkbox de mantener informado").located(By.name("newsletterOptIn"));
    public static final Target TERMINOCONDI_CHECK = Target.the("Checkbox de los teminos - condiciones").located(By.id("termOfUse"));
    public static final Target PRIVACY_CHECK = Target.the("Checkbox de privacidad").located(By.id("privacySetting"));
    public static final Target MENSAJE_TXT = Target.the("Mensaje que valida que le registro fue correcto").locatedBy("//span[contains(text(),'The last step')]");
}
