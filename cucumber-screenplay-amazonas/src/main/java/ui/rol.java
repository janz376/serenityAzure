package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class rol extends PageObject {

//  @FindBy(css=".btn.btn-default.button-search")
//  public static WebElementFacade SEARCH_BTN;

  public static Target ROL = Target.the("Search bar field")
          .locatedBy("#roleDefault > span > span.k-dropdown-wrap.k-state-default > input");
}
