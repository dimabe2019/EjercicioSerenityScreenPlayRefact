package co.com.utest.tasks;

import co.com.utest.interactions.Esperar;
import co.com.utest.model.ModelDataUtest;
import co.com.utest.userinterface.DefinirPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.utest.userinterface.DefinirPage.*;
import static co.com.utest.userinterface.IngresarPage.CIUDAD_INPUT;
import static co.com.utest.userinterface.IngresarPage.PAIS_INPUT;
import static co.com.utest.userinterface.RegistrarLosPage.MES_INPUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Definir implements Task {

    private ModelDataUtest modelDataUtest;

    public Definir(ModelDataUtest modelDataUtest) {
        this.modelDataUtest = modelDataUtest;
    }

    public static Definir caracteristicasDeLosDispositivosthe(ModelDataUtest modelDataUtest) {
        return Tasks.instrumented(Definir.class,modelDataUtest);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Esperar.estosSegundos(5),
                Click.on(SO_INPUT),
                Enter.theValue(modelDataUtest.getStrSO()).into(SO_SELECT).thenHit(Keys.ENTER),
                Click.on(VERSION_INPUT),
                Enter.theValue(modelDataUtest.getStrVersionSo()).into(VERSION_SELECT).thenHit(Keys.ENTER),
                Click.on(LENGUAJESO_INPUT),
                Enter.theValue(modelDataUtest.getStrLenguageSo()).into(LENGUAJESO_SELECT).thenHit(Keys.ENTER),
                Click.on(MARCAMOBIL_INPUT),
                Enter.theValue(modelDataUtest.getStrMobil()).into(MARCAMOBIL_SELECT).thenHit(Keys.ENTER),
                Click.on(MODELOMOBIL_INPUT),
                Enter.theValue(modelDataUtest.getStrModelo()).into(MODELOMOBIL_SELECT).thenHit(Keys.ENTER),
                Click.on(SOMOBIL_INPUT),
                Enter.theValue(modelDataUtest.getStrSOMobil()).into(SOMOBIL_SELECT).thenHit(Keys.ENTER),
                Click.on(NEXT3_BUTTON)
        );
    }
}
