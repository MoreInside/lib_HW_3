package guru.qa;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;



public class CssXpathExamples {
    // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
    void CssXpathExample (){

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("some text");
        $(by("data-testid", "email")).setValue("some text");
        $x("//*[@data-testid='email']").setValue("some text");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("some text");
        $(by("id", "email")).setValue("some text");
        $x("//*[@id='email']").setValue("some text");
        $(byId("email")).setValue("some text");
        $(By.id("email")).setValue("some text");
        $("#email").setValue("some text");

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("some text");
        $(by("name", "email")).setValue("some text");
        $x("//*[@name='email']").setValue("some text");
        $(byName("email")).setValue("some text");
        $(By.name("email")).setValue("some text");
        $("#email").setValue("some text");

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=\"inputtext login_form_input_box\"]").setValue("some text");
        $(by("class", "inputtext login_form_input_box")).setValue("some text");
        $x("//*[@class=\"inputtext login_form_input_box\"']").setValue("some text");
        $(byClassName("class")).setValue("some text");
        $(By.className("class")).setValue("some text");
        $(".login_form_input_box").setValue("some text");

        $("[class=\"inputtext][class=login_form_input_box\"]").setValue("some text");
        $("input[class=inputtext][class=login_form_input_box]").setValue("some text");
        $x("//input*[@class='inputtext'][@class='login_form_input_box']").setValue("some text");
        $("input.login_form_input_box").setValue("some text");
        $("input.inputtext.login_form_input_box").setValue("some text");
        $(".inputtext.login_form_input_box").setValue("some text");

        // <div class="inputtext>
        //      <input type="email" class="inputtext login_form_input_box">
        // <div>
        $(".login_form_input_box").setValue("some text");
        $(".inputtext") .$(".login_form_input_box").setValue("some text");
        $("div.inputtext input.login_form_input_box").setValue("some text");
        $("div.inputtext") .$("input.login_form_input_box").setValue("some text");

        //<div> Hello, QA GURU! </div>
        $(byText("Hello, QA GURU!"));
        $(withText("Hello, QA GURU!"));
        $x("//*[text()='Hello, QA GURU!']");
        $x("//*[contains(text), 'Hello, QA GURU!']");


    }
}
