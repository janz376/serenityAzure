package parametros;

//import static org.openqa.selenium.Keys.RETURN;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class tonelaje_fin_soap  implements Task{
	
	private String item;
//	private String item2;
	
	public tonelaje_fin_soap(String item){
		
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
//				.into("//*[@id='VA_4208YZBVPRVFAZM_203727']")
//				.thenHit(RETURN)
//				);
				
        	    Enter.theValue(item)
//				.into("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[12]/div/div/span/span/input[1]")
				.into("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
				
//				.thenHit(Keys.TAB)
//                ,
//                WaitUntil.angularRequestsHaveFinished()
//				
				);
		
	

	}
	
	public static tonelaje_fin_soap called(String item) {
		
		return Instrumented.instanceOf(tonelaje_fin_soap.class).withProperties(item);
	}
}

