package ui;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class tonelage_ini extends PageObject{
	

	
	public static Target CAJA_Tonelaje_ini = Target.the("Click en el boton buscar")

		.locatedBy("//*[@id=\"email\"]");
//		.located(ByAngular.model("#VA_3848TYUUAILVZUF_559727"));
}