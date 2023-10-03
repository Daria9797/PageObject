
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationWithPageObject extends TestBase {

    RegistrationPage regPage = new RegistrationPage();
    TestData testData=new TestData();
    @Test
    public void enterFormTest() {
        regPage.openPage().
                hideBanner().
                setFirstName(testData.randomName).
                setLastName(testData.randomLastName).
                setUserEmail(testData.randomEmail).
                setGender(testData.randomGender).
                setUserNumber(testData.randomNumber).
                setCalendar(testData.randomDay, testData.randomMonth, testData.randomYear).
                setSubjects(testData.randomSubject).
                setHobbies(testData.randomHobbi).
                pictureAdd(testData.randomPicture).
                setAdress(testData.randomAdress).
                setState(testData.randomState).
                setCity(testData.randomStateCity).
                clickSubmit().
                resultOfTable(testData.randomName+ " " +testData.randomLastName).
                resultOfTable(testData.randomEmail).
                resultOfTable(testData.randomGender).
                resultOfTable(testData.randomNumber).
                resultOfTable(testData.randomDay+ " " +testData.randomMonth+ "," +testData.randomYear).
                resultOfTable(testData.randomSubject).
                resultOfTable(testData.randomHobbi).
                resultOfTable(testData.randomPicture).
                resultOfTable(testData.randomAdress).
                resultOfTable(testData.randomState+" "+testData.randomStateCity);

    }


}
