package parametros;

import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class ano_ini_soap  implements Task{
	
	private String item;
//	private String item2;
	
	public ano_ini_soap(String item){
		
		this.item = item;
//		this.item2 = item2;
	}
	
	@Override
//	@Step("{0} {1} inserte nombre del cliente llamado '#item' '#item2'")
	@Step("{0} inserte nombre del cliente llamado '#item' ")
	public <T extends Actor> void performAs(T actor) {
		
//		actor.attemptsTo(
//				Click.on("#VA_8029SWYKDVLXSFJ_255727"),
//				WaitUntil.angularRequestsHaveFinished()
//			);

		
		actor.attemptsTo(

//        	    Switch.toFrame("shellTab337"),
        	    Enter.theValue(item)
				.into("//*[@id=\"userName\"]")
//				.thenHit(RETURN)
				);

	}
	
	public static ano_ini_soap called(String item) {
		
		return Instrumented.instanceOf(ano_ini_soap.class).withProperties(item);
	}
}

