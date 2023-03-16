package Test;

import Main.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OptionTest {

    Option options;
    @BeforeEach
    void setUp() {
        options = new Option("placeholder",5);
        options.addOption("Im option 1");
        options.addOption("Im option 2");
        options.addOption("Im option 3");
    }

    @Test
    void setDescription() {

        String description = "This is an option menu for a certain user on a website";
        options.setDescription(description);
    }

    @Test
    void getDescription() {
        System.out.println(options.getDescription());
    }

    @Test
    void setActualOption() {
        options.setActualOption(2);
    }

    @Test
    void getActualOption(){
        System.out.println(options.getActualOption());
    }

    @Test
    void addOption() {
        options.addOption("Im option 4");
    }

    @Test
    void showOptions() {
        options.showOptions();
    }
}