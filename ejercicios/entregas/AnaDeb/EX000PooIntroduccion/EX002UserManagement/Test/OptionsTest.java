import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class OptionsTest {

    @Test
    public void testAddOption() {
        Options options = new Options(3);
        options.addOption("Option 1");
        options.addOption("Option 2");
        options.addOption("Option 3");
        // Try adding a fourth option, which should not be allowed
        options.addOption("Option 4");
        List<String> optionList = options.getOptions();
        // Make sure only the first three options were added
        Assertions.assertEquals(3, optionList.size());
        Assertions.assertEquals("Option 1", optionList.get(0));
        Assertions.assertEquals("Option 2", optionList.get(1));
        Assertions.assertEquals("Option 3", optionList.get(2));
    }

    @Test
    public void testNoOptions() {
        Options options = new Options();
        List<String> optionList = options.getOptions();
        // Make sure no options were added
        Assertions.assertEquals(0, optionList.size());
    }

}