package tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

//Personalizados
//import screenplay.actions.refrescar;
//import screenplay.tasks.GoToLogin;
//import screenplay.tasks.inicio;
//import screenplay.user_interfaces.pagina_aplicacion;

import ui.pagina_aplicacion;
import utils.refrescar;

public class inicio implements Task {

    private Performable steps;
    private String title;

    private pagina_aplicacion pagina_aplicacion;

    @Step("{0} inicios and performs the step **#title**")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        		//Precondiciones del login
        		//Abrir la pagina
                Open.browserOn().the(pagina_aplicacion),
                //Borrar los cookies
                refrescar.theBrowserSession()
                //verifica que la tarea no sea vacia
               ,Check.whether(steps != null).andIfSo(Task.where(title, steps))
        );
    }
    
    //en el retorno del metodo se coloca la navegacion
    public static inicio prepareToSignIn() {
    	//para el login se requiere navegar haciendo click en la cabecera
    	//Abre y navega
        return instrumented(inicio.class, "Go to Login Screen", ir_a_login.called());
//    	return instrumented(inicio.class);
    }

    public inicio(String title, Performable steps) {
        this.title = title;
        this.steps = steps;
    }
}



//public static inicio readyToSearch() {
//  return instrumented(inicio.class, "User ready to Search", null);
//}
//