package co.com.utest.questions;

import co.com.utest.model.ModelDataUtest;
import co.com.utest.userinterface.GenerarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.utest.userinterface.GenerarPage.MENSAJE_TXT;

public class SePresenta implements Question {

    private ModelDataUtest modelDataUtest;

    public SePresenta(ModelDataUtest modelDataUtest) {
        this.modelDataUtest = modelDataUtest;
    }

    public static SePresenta elMensaje(ModelDataUtest modelDataUtest) {
        return new SePresenta(modelDataUtest);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean result;
        String mensajeExitoso = Text.of(MENSAJE_TXT).viewedBy(actor).asString();
        if (modelDataUtest.getStrMensaje().equals(mensajeExitoso)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
