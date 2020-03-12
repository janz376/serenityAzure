package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.ClicksPaneles;

public class PanelesClick implements Task{
	
	@Override
    @Step("{0} se realizan cuatro clicks en los paneles")
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(WaitUntil.the(ClicksPaneles.BUTTON_Principal, isVisible()).forNoMoreThan(15).seconds());
        actor.attemptsTo(Click.on(ClicksPaneles.BUTTON_Principal));
//        		,WaitUntil.angularRequestsHaveFinished());
//        actor.attemptsTo(Click.on(ClicksPaneles.ITEM_Administracion)
//        		,WaitUntil.angularRequestsHaveFinished());
//        
//        actor.attemptsTo(Click.on(ClicksPaneles.ITEM_Cartera));
//        actor.attemptsTo(Click.on(ClicksPaneles.ITEM_MantenimientoSOAP));
        
//        //Cambia de iFrame
//        actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
//        	    Click.on(ClicksPaneles.IFRAME),
//        	    Switch.toParentFrame()
//        	);
    }
    
    public static PanelesClick cuatroClickPaneles() {
		
		return instrumented(PanelesClick.class);
	}
}