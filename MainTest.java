import junit.framework.TestCase;

public class MainTest extends TestCase {
    String someString = "Hello, world!";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testPrintInt () {
        String actual = Main.printInt(50);
        String expected = "50";
        assertEquals(actual, expected);
    }

    public void testPrintString () {
        String actual = Main.printString();
        String expected = "Print String";
        assertEquals(actual, expected);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
