package co.com.utest.tasks;


import co.com.utest.userinterface.RegistrarLosPage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import co.com.utest.model.ModelDataUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.utest.userinterface.RegistrarLosPage.*;

public class RegistrarLos implements Task{

    private ModelDataUtest modelDataUtest;

    public RegistrarLos(ModelDataUtest modelDataUtest) {
        this.modelDataUtest = modelDataUtest;
    }

    public static RegistrarLos datosPersonales(ModelDataUtest modelDataUtest) {
        return Tasks.instrumented(RegistrarLos.class,modelDataUtest);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Enter.theValue(modelDataUtest.getStrNombre()).into(NOMBRE_INPUT),
              Enter.theValue(modelDataUtest.getStrApellido()).into(APELLIDO_INPUT),
              Enter.theValue(modelDataUtest.getStrEmail()).into(EMAIL_INPUT),
              Click.on(MES_INPUT),
              SelectFromOptions.byVisibleText(modelDataUtest.getStrMes()).from(MES_INPUT),
              SelectFromOptions.byVisibleText(modelDataUtest.getStrDia()).from(DIA_INPUT),
              SelectFromOptions.byVisibleText(modelDataUtest.getStrAnio()).from(ANIO_INPUT),
              Click.on(IDIOMA_INPUT),
              Enter.theValue(modelDataUtest.getStrLenguaje()).into(IDIOMA_INPUT).thenHit(Keys.ENTER),
              Click.on(NEXT_BUTTON)
      );
    }
}
