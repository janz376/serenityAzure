package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static ui.filial.*;

public class itemFilial implements Task {

    private String filial;

    public static itemFilial with(String filial){
        return instrumented(itemFilial.class, filial);
//        return Instrumented.instanceOf(itemFilial.class).withProperties(filial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Enter.theValue(filial)
//                        .into(FILIAL)
//                        .thenHit(Keys.ENTER)
//                ,
                SelectFromOptions.byVisibleText(filial).from("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")

        );
    }

    public itemFilial(String filial) {
        this.filial = filial;
    }

}
