package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ClicksPaneles extends PageObject{
	
	public static Target BUTTON_Principal = Target.the("Lista de Filial")
            .locatedBy("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	
//	public static Target ITEM_Administracion = Target.the("Opcion Banco Amazonas")
//            .locatedBy("//*[@id='panel-menu']/div[3]/div[6]/a/div[2]");
//	
//	public static Target ITEM_Cartera = Target.the("Opcion Banco Amazonas")
//            .locatedBy("//*[@id='panel-menu']/div[2]/div[1]");
//	
//	public static Target ITEM_MantenimientoSOAP = Target.the("Opcion Banco Amazonas")
//            .locatedBy("//*[@id='panel-menu']/div[2]/div[16]");
//	
//	public static Target IFRAME = Target.the("Opcion Banco Amazonas")
//            .locatedBy("#VA_1GYKFQZGOGPOKGW_836972_DIV > div > span > span > input");
//	
//	public static Target BUTTON_nuevo = Target.the("Opcion Banco Amazonas")
//            .locatedBy("//*[@id='QV_2685_88243_CUSTOM_CREATE']");
//	
//	
//	public static Target BUTTON_clase = Target.the("Opcion Banco Amazonas")
//            .locatedBy("#VA_6811DLQNDEATDBF_338727_DIV > div > span > span > input");
}