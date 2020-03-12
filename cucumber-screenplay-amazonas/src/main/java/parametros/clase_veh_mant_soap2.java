package parametros;

import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;

public class clase_veh_mant_soap2 implements Task{
	
	private String item;
//	private String item2;
	
	public clase_veh_mant_soap2(String item){
		
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
//				.into("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/span/span/input")
//				.thenHit(RETURN)
//				);
				
//        	    Switch.toFrame("shellTab337"),
        	    Enter.theValue(item)
				.into("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
//				.thenHit(RETURN)
				);
		
//		actor.attemptsTo(Enter.theValue(item2)
//				.into("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/span/span/input")
//				.thenHit(RETURN)
//				);
	}
	
	public static clase_veh_mant_soap2 called(String item) {
		
		return Instrumented.instanceOf(clase_veh_mant_soap2.class).withProperties(item);
	}
}
