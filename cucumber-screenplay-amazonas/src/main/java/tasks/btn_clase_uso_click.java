package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;
import ui.click_boton_buscar;

public class btn_clase_uso_click implements Task{
	
	@Override
    @Step("{0} se realizan dos clicks en la lista filial para escoger la opcion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
        	    Click.on(click_boton_buscar.BUTTON_Clase_VehUso));
    }
    
    public static btn_clase_uso_click btn_clase_uso_click() {
		
		return instrumented(btn_clase_uso_click.class);
	}

}
