package ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import questions.corre_ambiente;

public class cabecera_global_de_barra_navegacion extends PageObject {

    private static Target GET_LOGIN_SCREEN =Target.the("Desktop Sign In Button")
            .locatedBy("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
    //public static By GET_LOGIN_SCREEN = By.jquery("#_desktop_user_info > div > a > span");
    
//    se verifica si se esta corriendo en un ambiente movil
    public static Target getPantallaLogin() {
        if (corre_ambiente.ofValue() == corre_ambiente.Mobile)
        {
            GET_LOGIN_SCREEN = Target.the("Mobile Sign In Button")
                    .locatedBy("#_mobile_user_info > div > a");
        }
        return GET_LOGIN_SCREEN;
    }
}