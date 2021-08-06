package co.com.utest.stepdefinitions;



import co.com.utest.model.ModelDataUtest;
import co.com.utest.questions.SePresenta;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepdefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina de registro de Utest$")
    public void queMeEncuentroEnLaPaginaDeRegistroDeUtest()  {
        theActorCalled("Diego").wasAbleTo(Abrir.LaPagina());
    }


    @When("^complete todos los campos del formulario de registro$")
    public void completeTodosLosCamposDelFormularioDeRegistro(List<ModelDataUtest> modelDataUtests)  {
       theActorInTheSpotlight().attemptsTo(RegistrarLos.datosPersonales(modelDataUtests.get(0)),
                                            Ingresar.losDatosDeUbicacion(modelDataUtests.get(0)),
                                            Definir.caracteristicasDeLosDispositivosthe(modelDataUtests.get(0)),
                                            Generar.informacionDeSeguridad(modelDataUtests.get(0)));

    }

    @Then("^podre tener acceso a la pagina como usuario registrado$")
    public void podreTenerAccesoALaPaginaComoUsuarioRegistrado(List<ModelDataUtest> modelDataUtests) {
       theActorInTheSpotlight().should(seeThat(SePresenta.elMensaje(modelDataUtests.get(0))));
    }
}






