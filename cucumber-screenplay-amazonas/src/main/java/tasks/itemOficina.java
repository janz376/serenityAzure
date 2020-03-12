package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.oficina.*;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class itemOficina implements Task {

    private String oficina;

    public static itemOficina with(String oficina){
        return instrumented(itemOficina.class, oficina);
//        return Instrumented.instanceOf(itemOficina.class).withProperties(oficina);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Enter.theValue(oficina)
//                        .into(OFICINA)
//                        .thenHit(Keys.ENTER)
                SelectFromOptions.byVisibleText(oficina).from("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")

        );
    }

    public itemOficina(String oficina) {
        this.oficina = oficina;
    }

}
