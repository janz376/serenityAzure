package questions;



import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.resultados;


public class fecha {
    public static Question<String> departureTime() {
        return actor -> Text.of(resultados.FISRT_DEPARTURE_TIME).viewedBy(actor).asString();
    }

    public static Question<String> arrivalTime() {
        return actor -> Text.of(resultados.FISRT_ARRIVAL_TIME).viewedBy(actor).asString();
    }

    public static Question<String> tripDuration() {
        return actor -> Text.of(resultados.FISRT_TRIP_DURATION).viewedBy(actor).asString();
    }
}
