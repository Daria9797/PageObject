import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxWithPageObject extends TestBase {

    @Test
    public void checkTextBox() {

        TextBoxPage textBox = new TextBoxPage();
        textBox.openPage().hideBanner().setFullName("Darya Kuteinikova").setEmail("kolohmatowa@mail.ru").setCurrentAdress("Spb").setPermanentAdress("Moskow").clickSubmit();

        textBox.checkResults("Darya Kuteinikova", "kolohmatowa@mail.ru", "Spb", "Moskow");


    }


}
