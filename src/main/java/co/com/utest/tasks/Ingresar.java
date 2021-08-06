package co.com.utest.tasks;

import co.com.utest.interactions.Esperar;
import co.com.utest.userinterface.IngresarPage;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.utest.userinterface.IngresarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import co.com.utest.model.ModelDataUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.Keys;

public class Ingresar implements Task{

    private ModelDataUtest modelDataUtest;

    public Ingresar(ModelDataUtest modelDataUtest) {
        this.modelDataUtest = modelDataUtest;
    }

    public static Ingresar losDatosDeUbicacion(ModelDataUtest modelDataUtest) {
        return Tasks.instrumented(Ingresar.class,modelDataUtest);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.estosSegundos(15),
                Enter.theValue(modelDataUtest.getStrCiudad()).into(CIUDAD_INPUT),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD_INPUT),
                Hit.the(Keys.ENTER).into(CIUDAD_INPUT),
                Enter.theValue(modelDataUtest.getStrPostal()).into(CODPOSTAL_INPUT),
                Hit.the(Keys.ARROW_DOWN).into(CODPOSTAL_INPUT),
                Hit.the(Keys.ENTER).into(CODPOSTAL_INPUT),
                Esperar.estosSegundos(5),
                WaitUntil.the(PAIS_INPUT,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(PAIS_INPUT),
                Enter.theValue(modelDataUtest.getStrPais()).into(PAIS_SELECT).thenHit(Keys.ENTER),
                Click.on(NEXT2_BUTTON)
        );
    }
}
