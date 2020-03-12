package definition;

//Screenplay
//import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
//import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
//import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
//import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
//import static org.hamcrest.Matchers.equalTo;

//Feature
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.steps.ScenarioSteps;
import parametros.clase_veh_mant_soap2;
import parametros.uso_veh_mant_soap2;
//import planner.screenplay.questions.TheFirstTrain;
import questions.fecha;
//import steps.vehiculos_steps;
import tasks.PanelesClick;
//import tasks.btn_clase_click;
import tasks.btn_clase_uso_click;
import tasks.btn_nuevo_click;
import tasks.clase_veh_mant_soap;
import tasks.inicio;
import tasks.itemFilial;
import tasks.itemOficina;
import tasks.itemRol;
import tasks.login_entrar;
import tasks.uso_veh_mant_soap;
//import ui.ClicksPaneles;
//import ui.pagina_aplicacion;
import abilities.autenticar;

import parametros.fecha_vigencia_soap;
import parametros.ano_fin_soap;
import parametros.ano_ini_soap;
import parametros.cilindraje_fin_soap;
import parametros.cilindraje_ini_soap;
import parametros.monto_soap;
import parametros.pasajeros_desde_soap;
import parametros.pasajeros_hasta_soap;
import parametros.tonelaje_fin_soap;
import parametros.tonelaje_ini_soap;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
//Tarea
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import java.util.List;


public class usuario_loguea{
	

	@Before
	public void set_the_stage() {
		
		// Llamado a los actores con determinantes
		OnStage.setTheStage(new OnlineCast());
	}
	

	 @Given("^que (.*) se registra como miembro de amazonas$")
	public void que_Carla_se_registra_como_miembro_de_amazonas(String actor) throws Exception {

		theActorCalled(actor).wasAbleTo(inicio.prepareToSignIn());
	}

	@When("^(?:he|she|they|Byron) ella se logea con la credenciales validas$")
	public void she_ella_se_logea_con_la_credenciales_validas(DataTable credenciales) throws Exception {
		
		theActorInTheSpotlight().whoCan(autenticar.with(credenciales)).attemptsTo(login_entrar.withCredentials());
	}

	 @When("^(?:she|they) coloca las opciones de ingreso la (.*) la (.*) y la (.*)$")
	public void she_coloca_las_opciones_de_ingreso_la_filial_la_oficina_y_la_rol(List<String> filieales,
		List<String> oficinas, List<String> roles) throws Exception {
		 
		theActorInTheSpotlight().attemptsTo(itemFilial.with(filieales.get(0)));
		theActorInTheSpotlight().attemptsTo(itemOficina.with(oficinas.get(0)));
			theActorInTheSpotlight().attemptsTo(itemRol.with(roles.get(0)));
	}


//	@When("(.*) ingresa al aplicativo se valida que estan habilitados los paneles$")
//	public void she_ingresa_al_aplicativo_se_valida_que_estan_habilitados_los_paneles(String actor) throws Exception {
//		
//		theActorCalled(actor).wasAbleTo(PanelesClick.cuatroClickPaneles());
//		
//		theActorCalled(actor).wasAbleTo(clase_veh_mant_soap.called("AUTOMOVIL - AUTOMOVILES"));
//		theActorCalled(actor).wasAbleTo(uso_veh_mant_soap.called("PARTICULAR - USO PARTICULAR"));
//		theActorCalled(actor).wasAbleTo(btn_clase_uso_click.btn_clase_uso_click());
//		theActorCalled(actor).wasAbleTo(btn_nuevo_click.btn_nuevo_click());
//	}
		
	
	
	@When("(.*) reliza busqueda en (.*) y (.*) de vehiculo y (.*) y (.*) y (.*) y (.*) y (.*) y (.*) y (.*) y (.*) y (.*) y (.*)$")
	public void she_reliza_busqueda_en_clase_y_uso_de_vehiculo_y_fecha_vigencia_y_ano_ini_y_ano_fin_y_cilindraje_ini_y_cilindraje_fin_y_pasajeros_desde_y_pasajeros_hasta_y_tonelaje_ini_y_tonelaje_fin_y_monto
	(String actor, List<String> clase, List<String> uso, List<String> fecha_vigencia, List<String> ano_ini, 
		List<String> ano_fin, List<String> cilindraje_ini, List<String> cilindraje_fin, List<String> pasajeros_desde, 
		List<String> pasajeros_hasta, List<String> tonelaje_ini, List<String> tonelaje_fin, List<String> monto) throws Exception {

		theActorCalled(actor).wasAbleTo(clase_veh_mant_soap2.called(clase.get(0)));
		theActorCalled(actor).wasAbleTo(uso_veh_mant_soap2.called(uso.get(0)));	
		theActorCalled(actor).wasAbleTo(fecha_vigencia_soap.called(fecha_vigencia.get(0)));
		theActorCalled(actor).wasAbleTo(ano_ini_soap.called(ano_ini.get(0)));
		theActorCalled(actor).wasAbleTo(ano_fin_soap.called(ano_fin.get(0)));
		theActorCalled(actor).wasAbleTo(cilindraje_ini_soap.called(cilindraje_ini.get(0)));
		theActorCalled(actor).wasAbleTo(cilindraje_fin_soap.called(cilindraje_fin.get(0)));
		theActorCalled(actor).wasAbleTo(pasajeros_desde_soap.called(pasajeros_desde.get(0)));
		theActorCalled(actor).wasAbleTo(pasajeros_hasta_soap.called(pasajeros_hasta.get(0)));
		theActorCalled(actor).wasAbleTo(tonelaje_ini_soap.called(tonelaje_ini.get(0)));
		theActorCalled(actor).wasAbleTo(tonelaje_fin_soap.called(tonelaje_fin.get(0)));
		theActorCalled(actor).wasAbleTo(monto_soap.called(monto.get(0)));
	}
	

	@Then("(.*) should see that the first train departs at (\\d\\d,\\d\\d)$")
	public void she_should_see_that_the_first_train_departs_at(String actor, List<String> mes, List<String> dia, List<String> ano) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		
		theActorCalled(actor).should(
                seeThat("the first train leaves at", fecha.departureTime(), is(mes)),
                seeThat("the first train arrives at", fecha.arrivalTime(), is(dia)),
                seeThat("the first train arrives at", fecha.arrivalTime(), is(ano))
				);
	}


}
