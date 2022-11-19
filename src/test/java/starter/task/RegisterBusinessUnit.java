package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterBusinessUnit {
    public static Performable data(String name) {
        return Task.where("Test Choucair Organization",
                Click.on(LogicData.accessOrganization),
                Click.on(LogicData.accessBusiness),
                Click.on(LogicData.newBusiness),
                Enter.theValue(name).into(LogicData.nameOrg),
                Click.on(LogicData.listOrg),
                Click.on(LogicData.unity),
                Click.on(LogicData.saveOrg),
                Click.on(LogicData.clickAditional)


        );
    }


}
