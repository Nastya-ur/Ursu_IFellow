import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunTest {


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class SimpleTest {

        @BeforeAllAll
        public static void setUp() {
            System.out.println("Вывод до начала тестов");
        }

        @Test
        public void testAddition() {
            int a = 5;
            int b = 10;
            assertEquals(15, a + b, "5 + 10 должно быть равно 15");
        }

        @Test
        public void testSubtraction() {
            int a = 10;
            int b = 5;
            assertEquals(5, a - b, "10 - 5 должно быть равно 5");
        }

        @AfterAllAll
        public static void tearDown() {
            System.out.println("Вывод после прогона тестов");
        }
    }
}
