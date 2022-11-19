package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.navigation.LoginPage;
import starter.task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.hamcrest.CoreMatchers.everyItem;

public class LoginRegisterSerenity {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa al sitio")
    public void on_the_DuckDuckGo_home_page(String actor) {
        theActorCalled(actor).attemptsTo(LoginPage.pageStartSharp());
    }

    @When("Mis credenciales de acceso {string} {string} organization {string}")
    public void loginStartSharp(String user,String clave,String name) {
        withCurrentActor(
                Login.term(user, clave),
                RegisterBusinessUnit.data(name)
        );
    }
    @Then("Registramos reunion con nombre {string} en la unidad {string}")
    public void regMeetingStarsharp(String name,String unit ) {
        withCurrentActor(RegisterMeeting.meet(name,unit)

        );
    }
}
