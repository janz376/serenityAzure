package tasks;

//import static screenplay.user_interfaces.login_entrarForm.FILL_PASSWORD;
//import static screenplay.user_interfaces.login_entrarForm.FILL_USERNAME;
//import static screenplay.user_interfaces.login_entrarForm.SIGN_IN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.RETURN;

import abilities.autenticar;
import static ui.formulario_login.*;

public class login_entrar  implements Task {

    @Step("Logs in loaded {0}")
    public static login_entrar withCredentials(){
        return instrumented(login_entrar.class);
    }

    @Step
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
        		Click.on("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
        		,
                Enter.theValue(autenticacion(user).username())
                    .into(FILL_USERNAME),
                Enter.theValue(autenticacion(user).password())
                    .into(FILL_PASSWORD)
//                    .thenHit(RETURN)
                    ,
                Click.on(SIGN_IN)
        );
    }

    private autenticar autenticacion(Actor actor) {
       return autenticar.as(actor);
    }
}
