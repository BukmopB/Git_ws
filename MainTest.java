import junit.framework.TestCase;

public class MainTest extends TestCase {
    String someString = "Hello, world!";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testPrintString () {
        String actual = Main.printString();
        String expected = someString;
        assertEquals(actual, expected);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
