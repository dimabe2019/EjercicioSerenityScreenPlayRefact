package co.com.utest.tasks;

import co.com.utest.userinterface.AbrirPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.utest.userinterface.AbrirPage.REGISTRO_BTN;

public class Abrir implements Task{

    private AbrirPage abrirPage;


    public static Abrir LaPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(abrirPage),
                Click.on(REGISTRO_BTN)
        );
    }
}
