package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.ClicksPaneles;

public class btn_clase_click implements Task{
	
	@Override
    @Step("{0} se realizan dos clicks en la lista filial para escoger la opcion")
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
//        	    Click.on(ClicksPaneles.BUTTON_clase));
    }
    
    public static btn_clase_click btn_clase_click() {
		
		return instrumented(btn_clase_click.class);
	}

}