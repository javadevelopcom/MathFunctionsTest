import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.*;

public class sqrtTest {
    @Test
    public void test2()throws Exception{
        MathFunctions math = new MathFunctions();
        double x = math.sqrt(16);

        assertEquals(4.0,x);
//        assertTrue("NOT TRUE! SQRT result must be > 0 ", x > 0);
//        assertFalse("FALSE! SQRT result is not > 0", x < 0);
//        assertNotNull("Some object is NULL as not expected", x);
//        assertNull("Some object is NOT NULL as expected", x);
    }
}
