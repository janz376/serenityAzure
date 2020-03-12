package utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class refrescar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().deleteAllCookies();
    }

    public static refrescar theBrowserSession() {
        return new refrescar();
    }
}