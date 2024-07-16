import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTestNGTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @DataProvider(name = "ageTest")
    Object[][] ageDataProvider() {
        return new Object[][]{
                {10, true},
                {11, true},
                {12, true},
                {13, true},
                {25, false}
        };
    }
    @Test
    public void testIsTeenager(){
        boolean result = Person.isTeenager(25);
        assertFalse(result);
        result = Person.isTeenager(91);
        assertFalse(result);
    }

    private void assertFalse(boolean result) {

    }

    @Test(dataProvider = "ageTest")
    public void testIsTeenager(int age, boolean result) {
        assertEquals(result, Person.isTeenager(age));
    }
}

