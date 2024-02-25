
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunTest1 {

    @BeforeAll
    public static void beforeAll(){
    System.out.println("Начало тестирования");
}

    @AfterAll
    public static void afterAll(){
        System.out.println("Конец тестирования");
    }

    @Test
    public void test1(){
            int a = 10;
            int b = 5;
            Assertions.assertEquals(5, a - b, "10 - 5 должно быть равно 5");
        }

      @Test
      public void test2(){
         int a = 10;
         int b = 6;
          Assertions.assertEquals(5, a - b, "10 - 5 должно быть равно 5");
}

      @Test
       public void test3(){
        int a = 20;
        int b = 10;
        int c = 30;
          Assertions.assertEquals(60, a + b + c, "20+10+30 должно быть равно 5");
      }

}
