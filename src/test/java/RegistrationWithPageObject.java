import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationWithPageObject extends TestBase {
    RegistrationPage regPage = new RegistrationPage();

    @Test
    public void enterFormTest() {
        regPage.openPage().
                hideBanner().
                setFirstName("Daria").
                setLastName("Kuteynikova").
                setUserEmail("kolohmatova@yandex.ru").
                setGender("Female").
                setUserNumber("9002172121").
                setCalendar("06", "January", "1997").
                setSubjects("Maths").
                setHobbies("Sports", "Reading").pictureAdd("cat.jpg").
                setAdress("Moskow").setCityState("Haryana", "Karnal").
                clickSubmit().
                resultOfTable("Daria Kuteynikova").
                resultOfTable("kolohmatova@yandex.ru").
                resultOfTable("Female").
                resultOfTable("9002172121").
                resultOfTable("6 January,1997").
                resultOfTable("Maths").
                resultOfTable("Sports, Reading").
                resultOfTable("cat.jpg").
                resultOfTable("Moskow").
                resultOfTable("Haryana Karnal");

    }


}
