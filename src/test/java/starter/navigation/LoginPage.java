package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class LoginPage {
    public static Performable pageStartSharp() {
        return Task.where("Access to  serenity page",
                Open.browserOn().the(LoginStartSharp.class));
    }
}
