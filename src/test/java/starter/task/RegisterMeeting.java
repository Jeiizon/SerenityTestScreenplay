package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterMeeting {

    public static Performable meet(String name,String unit ) {
        return Task.where("Register meeting",
                Click.on(LogicData.moduleAccess),
                Click.on(LogicData.accessMeeting),
                Click.on(LogicData.newMeeting),
                Enter.theValue(name).into(LogicData.nameMeeting),
                Enter.theValue().into(LogicData.typeMeeting),
                Enter.theValue("143024").into(LogicData.numberMeeting),
                Enter.theValue("11/24/2022").into(LogicData.startDate),
                Enter.theValue("11/24/2022").into(LogicData.endDate),
                Click.on(LogicData.locationList),
                Enter.theValue("On Site").into(LogicData.searchLocation),
                Click.on(LogicData.selectLocation),
                Click.on(LogicData.unitList),
                Enter.theValue(unit).into(LogicData.searchUnit),
                Click.on(LogicData.selectUnit),
                Click.on(LogicData.organizerList),
                Enter.theValue("Jason Cooper").into(LogicData.searchOrganizer),
                Click.on(LogicData.selectOrganizer),
                Click.on(LogicData.reporterList),
                Enter.theValue("Brian Morgan").into(LogicData.searchReporter),
                Click.on(LogicData.selectReporter),
                Click.on(LogicData.attendeeList),
                Enter.theValue("Christina Cook").into(LogicData.searchAttendee),
                Click.on(LogicData.selectAttendee),
                Click.on(LogicData.saveMeeting),
                Click.on(LogicData.refreshPage)




        );
    }


}
