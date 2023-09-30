package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    SelenideElement userNameInput=$("#userName"),
    userEmailInput= $("#userEmail"),
    userCurrentAdress= $("#currentAddress"),
    userPermanentAdress=$("#permanentAddress"),
    submitTextBox=$("#submit"),

    resultName=$("#name"),
    resultEmail=$("#email"),
    resultCurrentAdress=$("#output").$("#currentAddress"),
    resultPermanentAdress=$("#output").$("#permanentAddress");


    public TextBoxPage openPage(){
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setFullName(String name){

        userNameInput.setValue(name);
        return this;
    }

    public TextBoxPage setEmail(String email){

        userEmailInput.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAdress(String adress){

        userCurrentAdress.setValue(adress);
        return this;
    }

    public TextBoxPage setPermanentAdress(String peradress){

        userPermanentAdress.setValue(peradress);
        return this;
    }

    public TextBoxPage clickSubmit(){

        submitTextBox.click();
        return this;
    }

    public TextBoxPage checkResults(String name,String email,String curadress,String peradrees){

        resultName.shouldHave(Condition.text("Darya Kuteinikova"));
        resultEmail.shouldHave(Condition.text("kolohmatowa@mail.ru"));
        resultCurrentAdress.shouldHave(Condition.text("Spb"));
        resultPermanentAdress.shouldHave(Condition.text("Moskow"));
        return this;
    }






}
