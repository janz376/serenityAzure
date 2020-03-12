package parametros;

import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class ano_fin_soap implements Task{
	
	private String item;
//	private String item2;
	
	public ano_fin_soap(String item){
		
		this.item = item;
//		this.item2 = item2;
	}
	
	@Override
//	@Step("{0} {1} inserte nombre del cliente llamado '#item' '#item2'")
	@Step("{0} inserte nombre del cliente llamado '#item' ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

//        	    Switch.toFrame("shellTab337"),
        	    Enter.theValue(item)
				.into("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
//				.thenHit(RETURN)
				);

	}
	
	public static ano_fin_soap called(String item) {
		
		return Instrumented.instanceOf(ano_fin_soap.class).withProperties(item);
	}
}

