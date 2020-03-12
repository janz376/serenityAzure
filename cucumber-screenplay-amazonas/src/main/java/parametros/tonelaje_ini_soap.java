package parametros;

//import static org.openqa.selenium.Keys.RETURN;
//import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.annotations.findby.How;
//
////import static org.openqa.selenium.Keys.RETURN;
//
//import net.serenitybdd.core.steps.Instrumented;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.waits.WaitUntil;
//import net.thucydides.core.annotations.Step;
//import ui.tonelage_ini;
//
////import static org.openqa.selenium.Keys.RETURN;
import static ui.tonelage_ini.*;

//
//import org.hamcrest.core.Is;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Duration;
//import org.openqa.selenium.support.ui.Wait;

//import org.hamcrest.core.Is;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.Duration;
//import org.openqa.selenium.support.ui.Wait;
//
//import com.paulhammant.ngwebdriver.ByAngular;
//
//import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
//import net.serenitybdd.screenplay.actions.Hit;
//import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

//import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
//import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
//import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;



public class tonelaje_ini_soap  implements Task{
	
	private String item;
//	private String item2;
	
		public tonelaje_ini_soap(String item){
		this.item = item;
//		this.item2 = item2;
	}
	
	@Override
//	@Step("{0} {1} inserte nombre del cliente llamado '#item' '#item2'")
	@Step("{0} inserte nombre del cliente llamado '#item' ")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
//				Click.on(CAJA_Tonelaje_ini)
//				,
        	    Enter.theValue(item)
				.into(CAJA_Tonelaje_ini)
//				.thenHit(Keys.TAB)
//				,
//				Check.whether(the(CAJA_Tonelaje_ini), isCurrentlyVisible())
//                .andIfSo(WaitUntil.the(CAJA_Tonelaje_ini, isNotCurrentlyVisible()))
//                ,
//                WaitUntil.angularRequestsHaveFinished()
				);
	}

	public static tonelaje_ini_soap called(String item) {
		
		return Instrumented.instanceOf(tonelaje_ini_soap.class).withProperties(item);
	}
}





//actor.attemptsTo(
////	    Switch.toFrame("shellTab337"),
//	    Click.on(CAJA_Tonelaje_ini)
//		,				
//		WaitUntil.angularRequestsHaveFinished());
//
//actor.attemptsTo(
////	    Switch.toFrame("shellTab337"),
//	    Click.on(CAJA_Tonelaje_ini)
//		,				
//		WaitUntil.angularRequestsHaveFinished());
//
//actor.attemptsTo(
////	    Switch.toFrame("shellTab337"),
//	    Click.on(CAJA_Tonelaje_ini)
//		,				
//		WaitUntil.angularRequestsHaveFinished());



//actor.attemptsTo(
////		Click.on(CAJA_Tonelaje_ini)
////		,				
////		WaitUntil.angularRequestsHaveFinished()
////		,
//		 Enter.theValue(item)
//			.into(CAJA_Tonelaje_ini)
//			.thenHit(Keys.ENTER)
////			.waitForAngularRequestsToFinish()
//			,				
//			WaitUntil.angularRequestsHaveFinished()
////			,
////		waitForAngularRequestsToFinish()
//	
//			);

//actor.attemptsTo(
//		UseAngular.disableSynchronisation()
//		,
//	Click.on(CAJA_Tonelaje_ini)
//	,	
//		Wait.upTo(Duration.ofSeconds(5)).until(CAJA_Tonelaje_ini, Is.invisible()))
//,passwordInput
		
//      Enter.theValue("item")
//       .into("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[11]/div/div/span/span/input[1]")
//       .thenHit(RETURN)
//       ,
//  WaitUntil.angularRequestsHaveFinished()
//);
		
//      Enter.theValue("item")
//           .into(CAJA_Tonelaje_ini)
//           .thenHit(Keys.ENTER),
//      WaitUntil.angularRequestsHaveFinished()
//);

//actor.attemptsTo(
//Click.on("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[11]/div/div/span/span/input[1]"),
//WaitUntil.angularRequestsHaveFinished()
//);

//actor.attemptsTo(
//Enter.theValue(item)
//	.into("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[11]/div/div/span/span/input[1]")
//	.thenHit(RETURN)
//	);

//actor.attemptsTo(
//		  Enter.theValue(item)
//			.into("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[12]/div/div/span/span/input[1]")
////			.thenHit(RETURN)
//			);

//}
