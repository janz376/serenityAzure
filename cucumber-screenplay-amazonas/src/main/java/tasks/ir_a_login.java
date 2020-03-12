package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static ui.cabecera_global_de_barra_navegacion.getPantallaLogin;

public class ir_a_login {
	  public static Task called () {
	       return Task.where("Go To Login screen",
	               Click.on(getPantallaLogin()));
	    }
	}