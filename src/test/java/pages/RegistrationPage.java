package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableComponent;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    SelenideElement firstNameInput=$("#firstName"),
            lastNameInput=$("#lastName"),
            userEmailInput=$("#userEmail"),
            genterWrapperInput=$("#genterWrapper"),
            userNumberInput=$("#userNumber"),
            userSubjectsInput=$("#subjectsInput"),
            userHobbiesInput= $("#hobbiesWrapper"),
            pictureLoad=$("#uploadPicture"),
            userAdressInput=$("#currentAddress"),
           userStateInput=$("#state"),
            userCityInput=$("#city"),
           userCityWrapper=$("#stateCity-wrapper"),
            submitRegistration=$("#submit");

    CalendarComponent calendar=new CalendarComponent();
    TableComponent table=new TableComponent();
    public RegistrationPage openPage(){
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage hideBanner(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String firstName){

        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName){

        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String email){

        userEmailInput.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String gender){

        genterWrapperInput.$(byText(gender)).click();
        return this;
    }


    public RegistrationPage setUserNumber(String number){

        userNumberInput.setValue(number);
        return this;
    }


    public RegistrationPage setCalendar(String day, String month, String year){

        $("#dateOfBirthInput").click();
        calendar.setDate(day, month, year);
        return this;
    }
    public RegistrationPage setSubjects(String subject){

        userSubjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String hobby){

        userHobbiesInput.$(byText(hobby)).click();

        return this;
    }

    public RegistrationPage pictureAdd(String file){

        pictureLoad.uploadFromClasspath(file);
        return this;
    }

    public RegistrationPage setAdress(String adress){

        userAdressInput.setValue(adress);
        return this;
    }


    public RegistrationPage setState(String state) {

        userStateInput.click();
        userCityWrapper.$(byText(state)).click();
        return this;
    }
    public RegistrationPage setCity(String city) {

        userCityInput.click();
        userCityWrapper.$(byText(city)).click();
        return this;
    }

    public RegistrationPage clickSubmit(){
        submitRegistration.click(); return this;
    }

    public RegistrationPage resultOfTable(String value){
        table.checkResultTable(value);
        return this;
    }

}
