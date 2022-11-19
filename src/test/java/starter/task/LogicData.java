package starter.task;

import org.openqa.selenium.By;

public class LogicData {
    public static By username = By.xpath("//input[contains(@id, 'LoginPanel0_Username')]");
    public static By password = By.xpath("//input[contains(@id, 'LoginPanel0_Password')]");
    public static By validate = By.xpath("(//button[contains(@id,'LoginPanel0_LoginButton')])");


    /* ESPACIO PARA ORGANIZACIÓN */
    public static By accessOrganization = By.xpath("//span[contains(@class, 's-sidebar-link-text') and contains(text(), 'Organization')]");
    public static By accessBusiness = By.xpath("//span[contains(@class, 's-sidebar-link-text') and contains(text(), 'Business Units')]");
    public  static  By newBusiness = By.xpath("//span[contains(@class,'button-inner')]/ancestor::div[contains(@class, 'button-outer')]");

    public static By nameOrg = By.xpath("//input[contains(@id, 'Serenity_Pro_Organization_BusinessUnitDialog3_Name')]");

    public static By listOrg = By.xpath("//a[contains(@class, 'select2-choice select2-default')]");

    public static By unity = By.xpath("//span[contains(@class,'select2-match')]/ancestor::div[contains(@class, 'select2-result-label')]");

    public static By saveOrg = By.xpath("//span[contains(@class,'button-inner')]/ancestor::div[contains(@class, 'tool-button save-and-close-button icon-tool-button')]");
    public  static By clickAditional = By.xpath("//button[contains(@id, 's-sidebar-toggler')]");


    /* ESPACIO PARA ORGANIZACIÓN */
    public  static  By moduleAccess = By.xpath("//span[contains(@class, 's-sidebar-link-text') and contains(text(), 'Meeting')]");
    public static By accessMeeting = By.xpath("//span[contains(@class, 's-sidebar-link-text') and contains(text(), 'Meetings')]");
    public  static  By newMeeting = By.xpath("//span[contains(@class,'button-inner')]/ancestor::div[contains(@class, 'button-outer')]");
    public static  By nameMeeting = By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_MeetingName')]");
    public static  By typeMeeting = By.xpath("//span[contains(@id,'select2-chosen-6')]");
    public static  By numberMeeting = By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber')]");
    public static  By startDate = By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_StartDate')]");
    public static  By endDate = By.xpath("//input[contains(@id,'Serenity_Pro_Meeting_MeetingDialog10_EndDate')]");

    // SELECT LOCATION
    public static By locationList = By.xpath("//span[starts-with(@id,'select2-chosen-7')]");
    public static By searchLocation = By.xpath("//input[contains(@id,'s2id_autogen7_search')]");
    public static By selectLocation = By.xpath("//span[contains(@class,'select2-match')]");

    // SELECT UNIT
    public static By unitList = By.xpath("//span[starts-with(@id,'select2-chosen-8')]");
    public static By searchUnit = By.xpath("//input[contains(@id,'s2id_autogen8_search')]");
    public static By selectUnit = By.xpath("//span[contains(@class,'select2-match')]");

    // SELECT ORGANIZER

    public static By organizerList = By.xpath("//span[starts-with(@id,'select2-chosen-9')]");
    public static By searchOrganizer = By.xpath("//input[contains(@id,'s2id_autogen9_search')]");
    public static By selectOrganizer = By.xpath("//span[contains(@class,'select2-match')]");

    // SELECT REPORTER
    public static By reporterList = By.xpath("//span[starts-with(@id,'select2-chosen-10')]");
    public static By searchReporter = By.xpath("//input[contains(@id,'s2id_autogen10_search')]");
    public static By selectReporter = By.xpath("//span[contains(@class,'select2-match')]");

    // SELECT ATTENDEE
    public static By attendeeList = By.xpath("//span[starts-with(@id,'select2-chosen-12')]");
    public static By searchAttendee = By.xpath("//input[contains(@id,'s2id_autogen12_search')]");
    public static By selectAttendee = By.xpath("//span[contains(@class,'select2-match')]");
    public static By saveMeeting = By.xpath("//span[contains(@class,'button-inner')]/ancestor::div[contains(@class, 'tool-button save-and-close-button icon-tool-button')]");
    public static By refreshPage = By.xpath("//i[contains(@class,'fa fa-refresh text-blue')]");

}
