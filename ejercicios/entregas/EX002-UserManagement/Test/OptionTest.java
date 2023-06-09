import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static javax.naming.directory.BasicAttribute.arrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    String u;
    @BeforeEach
    void setUp() {
    }

    @Test
    void getOptions() {
    Option option = new Option(new String[]{"option1","option2","option3"},0,3);
    assertArrayEquals(new String[]{"Option 1", "Option 2", "Option 3"}, result);
    }

    @Test
    void setOptions() {
        Option.setOptions(new String[]{"New Option 1", "New Option 2", "New Option 3"});
        String[] result = Option.getOptions();
        assertArrayEquals(new String[]{"New Option 1", "New Option 2", "New Option 3"}, result);
    }

    @Test
    void getOptionSelection() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        int result = option.getOptionSelection();
        Assert.assertEquals(0, result);
    }

    @Test
    void setOptionSelection() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        option.setOptionSelection(1);
        int result = option.getOptionSelection();
        Assert.assertEquals(0, result);
    }

    @Test
    void getMaxOptions() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        int result = option.getMaxOptions();
        Assert.assertEquals(3, result);
    }

    @Test
    void setMaxOptions() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        option.setMaxOptions(5);
        int result = option.getMaxOptions();
        Assert.assertEquals(5, result);
    }

    @Test
    void options() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        option.options(2);
        int result1 = option.getMaxOptions();
        Assert.assertEquals(2, result1);
        String[] result2 = option.getOptions();
        Assert.assertArrayEquals(new String[2], result2);
        int result3 = option.getOptionSelection();
        Assert.assertEquals(0, result3);
    }

    @Test
    void add() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        option.add("New Option 1");
        option.add("New Option 2");
        String[] result = option.getOptions();
        Assert.assertArrayEquals(new String[]{"New Option 1", "New Option 2", "Option 3"}, result);
    }

    @Test
    void showList() {
        Option option = new Option(new String[]{"Option 1", "Option 2", "Option 3"}, 0, 3);
        Option.add("New Option 1");
        Option.add("New Option 2");
        Option.showList("options");
    }

    @Test
    void showOption() {
        Option option = new Option(new String[]{"Option 1", "Option 2"}, 0, 2);
        assertEquals("Option 1", option.showOption(0));
        assertEquals("", option.showOption(2));
    }
}