package tasks;

import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;

public class uso_veh_mant_soap implements Task{
	
	private String item;
//	private String item2;
	
	public uso_veh_mant_soap(String item){
		
		this.item = item;
//		this.item2 = item2;
	}
	
	@Override
//	@Step("{0} {1} inserte nombre del cliente llamado '#item' '#item2'")
	@Step("{0} inserte nombre del cliente llamado '#item' ")
	public <T extends Actor> void performAs(T actor) {
//		actor.attemptsTo(Enter.theValue(item)
//				.into("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/span/span/input")
//				.thenHit(RETURN)
//				);
		
//		actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
//        	    Enter.theValue(item)
//				.into("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/span/span/input")
//				.thenHit(RETURN)
//				);
		
//		actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
//        	    Enter.theValue(item)
//				.into("#VA_2NTQZMCGPPIKCKR_313972_DIV > div > span > span > input")
//				.thenHit(RETURN)
//				);
		
		actor.attemptsTo(
//        	    Switch.toFrame("shellTab337"),
        	    Enter.theValue(item)
				.into("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/span/span/input")
				.thenHit(RETURN)
				);
		
//		try {
//		Thread.sleep(50000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
	
	public static uso_veh_mant_soap called(String item) {
		
		return Instrumented.instanceOf(uso_veh_mant_soap.class).withProperties(item);
	}
}
