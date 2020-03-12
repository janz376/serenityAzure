package ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class filial extends PageObject {

//    @FindBy(css=".btn.btn-default.button-search")
//    public static WebElementFacade SEARCH_BTN;

    public static Target FILIAL = Target.the("Search bar field")
            .locatedBy("#filialDefault > span > span.k-dropdown-wrap.k-state-default > input");
}
