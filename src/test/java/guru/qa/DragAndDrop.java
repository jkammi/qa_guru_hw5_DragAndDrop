package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @Test
    void dragNdrop_test(){
        open("/drag_and_drop");
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(320, 0).release().perform(); // doesn't work
        $("#column-a").dragAndDropTo("#column-b");
        $("#columns").lastChild().shouldHave(Condition.text("A"));
    }
}
