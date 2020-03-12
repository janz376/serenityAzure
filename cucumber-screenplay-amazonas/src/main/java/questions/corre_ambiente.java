package questions;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public enum corre_ambiente {
    Mobile, Desktop;

    public static corre_ambiente ofValue(){
        EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
        if(env.aValueIsDefinedFor("appium.platformName")) return Mobile;
        return Desktop;
    }
}
