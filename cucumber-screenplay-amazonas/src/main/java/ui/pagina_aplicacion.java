package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

	@DefaultUrl("http://newtours.demoaut.com/")
	public class pagina_aplicacion extends PageObject {
		
		public void tonelaje_ini(String tonelaje_ini) {
//			find(By.name("username")).sendKeys(strUsuario);
//			find(By.id("login")).sendKeys(tonelaje_ini);
			find(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[11]/div/div/span/span/input[1]")).sendKeys(tonelaje_ini);
		}
		
		public void tonelaje_fin(String tonelaje_fin) {
//			find(By.name("password")).sendKeys(strPass);
//			find(By.id("password")).sendKeys(tonelaje_fin);
			find(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[12]/div/div/span/span/input[1]")).sendKeys(tonelaje_fin);
		}

		public void monto(String monto) {
//			find(By.name("password")).sendKeys(strPass);
//			find(By.id("password")).sendKeys(monto);
			find(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[13]/div/div/span/span/input[1]")).sendKeys(monto);
		}
		
		public void clickIngresar() {
//			find(By.name("password")).sendKeys(Keys.ENTER);
			// Boton Transmitir
			find(By.xpath("//*[@id='CM_TLOANSJV_J_1']")).click();

		}

	}

