import org.junit.jupiter.api.Test;
import ru.clevertec.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest(){
        String st = "5.7";
        assertTrue(new StringUtils().isPositiveNumber(st));
    }
}
