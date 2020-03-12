package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class oficina extends PageObject {

//  @FindBy(css=".btn.btn-default.button-search")
//  public static WebElementFacade SEARCH_BTN;

  public static Target OFICINA = Target.the("Search bar field")
          .locatedBy("#officeDefault > span > span.k-dropdown-wrap.k-state-default > input");
}
