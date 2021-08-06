package co.com.utest.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.utest.util.UtilidadTiempo.condicionExitosa;

public class Esperar implements Interaction {

    private int seconds;

    public Esperar(int seconds) {
        this.seconds = seconds;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Awaitility.await().forever().pollInterval(seconds, TimeUnit.SECONDS).until(condicionExitosa());
    }

    public static Esperar estosSegundos(int seconds) {
        return Instrumented.instanceOf(Esperar.class).withProperties(seconds);
    }
}
