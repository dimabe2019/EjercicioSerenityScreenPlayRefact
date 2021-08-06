package co.com.utest.tasks;

import co.com.utest.model.ModelDataUtest;
import co.com.utest.userinterface.GenerarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.utest.userinterface.GenerarPage.*;

public class Generar implements Task {

    private ModelDataUtest modelDataUtest;

    public Generar(ModelDataUtest modelDataUtest) {
        this.modelDataUtest = modelDataUtest;
    }

    public static Generar informacionDeSeguridad(ModelDataUtest modelDataUtest) {
        return Tasks.instrumented(Generar.class,modelDataUtest);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(modelDataUtest.getStrPassword()).into(PASSWORD_INPUT),
                Enter.theValue(modelDataUtest.getStrConfirmPas()).into(CONFIRMPASSWORD_INPUT),
                Click.on(MANTENERINFO_CHECK),
                Click.on(TERMINOCONDI_CHECK),
                Click.on(PRIVACY_CHECK)
        );
    }
}
