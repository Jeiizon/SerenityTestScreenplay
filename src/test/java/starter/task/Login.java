package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {
    public static Performable term(String user, String clave) {
        return Task.where("Test Choucair",
                Clear.field(LogicData.username),
                Enter.theValue(user).into(LogicData.username),
                Clear.field(LogicData.password),
                Enter.theValue(clave).into(LogicData.password),
                Click.on(LogicData.validate)
         //       Click.on(LogicData.clickAditional)





        );
    }

}
