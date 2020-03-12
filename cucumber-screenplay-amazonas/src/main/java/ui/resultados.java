package ui;


import net.serenitybdd.screenplay.targets.Target;

public class resultados {

    public static final Target RESULTS_LIST = Target.the("Results list").locatedBy("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b");;

    public static final Target FISRT_DEPARTURE_TIME
            = Target.the("departure time").locatedBy(".tp-result-item .first-child, departure-time");

    public static final Target FISRT_ARRIVAL_TIME
            = Target.the("arrival time").locatedBy(".tp-result-item .first-child, arrival-time");

    public static final Target FISRT_TRIP_DURATION
            = Target.the("arrival time").locatedBy(".tp-result-item .first-child, tp-result-item-timing-duration");
}