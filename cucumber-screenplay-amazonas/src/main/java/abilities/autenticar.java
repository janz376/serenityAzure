package abilities;

import java.util.Map;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import utils.convertir_datos_tabla_cucumber;
import utils.exceptions.CannotAuthenticateException;

//Personalizadas
//import screenplay.abilities.autenticar;
//import screenplay.exceptions.CannotautenticarException;
//import utils.convertir_datos_tabla_cucumber;



public class autenticar implements Ability {

    private final String username;
    private final String password;

    // instantiates the Ability and enables fluent DSL
    public static autenticar with(String username,String password){
        return new autenticar(username, password);
    }
    public static autenticar with(DataTable credentialsData){
        Map<String,String> credentials =  convertir_datos_tabla_cucumber.toMap(credentialsData);
        return new autenticar(credentials.get("username"), credentials.get("password"));
    }

    public static autenticar as(Actor actor) throws CannotAuthenticateException {
        // complain if someone's asking the impossible
        if(actor.abilityTo(autenticar.class) == null){
            throw new CannotAuthenticateException(actor.getName());
        }

        return actor.abilityTo(autenticar.class);
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    private autenticar(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
