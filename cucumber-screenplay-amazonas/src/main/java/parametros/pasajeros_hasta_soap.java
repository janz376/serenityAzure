package parametros;

//import static org.openqa.selenium.Keys.RETURN;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class pasajeros_hasta_soap implements Task{
	
	private String item;
//	private String item2;
	
	public pasajeros_hasta_soap(String item){
		
		this.item = item;
//		this.item2 = item2;
	}
	
	@Override
//	@Step("{0} {1} inserte nombre del cliente llamado '#item' '#item2'")
	@Step("{0} inserte nombre del cliente llamado '#item' ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

//        	    Switch.toFrame("shellTab337"),
//        	    Enter.theValue(item)
//				.into("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")
//				.thenHit(Keys.TAB)
//				,
//				 Click.on("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[52]")

	                SelectFromOptions.byVisibleText("COLOMBIA").from("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")

				 //				 ,
//				  Click.on("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")

				);

	}
	
	public static pasajeros_hasta_soap called(String item) {
		
		return Instrumented.instanceOf(pasajeros_hasta_soap.class).withProperties(item);
	}
}

