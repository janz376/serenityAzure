package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.RETURN;
import static ui.rol.*;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class itemRol implements Task {

    private String rol;

    public static itemRol with(String rol){
        return instrumented(itemRol.class, rol);
//        return Instrumented.instanceOf(itemRol.class).withProperties(rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Enter.theValue(rol)
//                        .into(ROL)
//                        .thenHit(Keys.ENTER)
        		SelectFromOptions.byVisibleText(rol).from("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")
        ,
		  Click.on("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")

        		);
    }

    public itemRol(String rol) {
        this.rol = rol;
    }

}
