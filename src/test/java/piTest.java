import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class piTest {
    @Test
    public void test1() throws Exception {

        MathFunctions math = new MathFunctions();
        double x = math.pi();

        assertEquals(3.141592653589793, x);
//        assertNotNull("Some object is NULL as not expected", null);
//        assertTrue("Some boolean value is NOT TRUE as expected",x==3.141592653589793);
//        assertFalse("Some boolean value is NOT FALSE as expected",x!=3.141592653589793);
    }
}
