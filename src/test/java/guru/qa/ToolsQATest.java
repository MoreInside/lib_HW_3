package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ToolsQATest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }
    @Test
    void fillFormTest() {
        //open resourse
        open("/automation-practice-form");

        //closed banners
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        // fill form FIO
        $("#firstName").setValue("Тестов");
        $("#lastName").setValue("Василий");
        $("#userEmail").setValue("test@test.com");

        //choose gender
        $("#genterWrapper").$(byText("Male")).click();

        // mobile number
        $("#userNumber").setValue("91234567890");

        //date of birth
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--017").click();

        //subjectsContainer

        $("#subjectsInput").setValue("Chemistry").pressEnter();

        //choose hobbies

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        //upload pictures
        //$("#uploadPicture").uploadFromClasspath("images.png");

        // address
        $("#currentAddress").val("Moscow, Prospekt Mira str.");

        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#stateCity-wrapper").$(byText("Agra")).click();

        // accepted
        $("#submit").click();

         // prover_ochka
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Тестов Василий"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("test@test.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("9123456789"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("17 May,2000"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Chemistry"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Sports, Reading, Music"));
        //$(".table-responsive").$(byText("Picture")).parent().shouldHave(text("images.png"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Moscow, Prospekt Mira str."));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Agra"));

    }
}

