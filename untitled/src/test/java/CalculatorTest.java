import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "4,40,47",
            "99,1,100"
    })
    public void testSumma(int a, int b, int excepted) {
        Assertions.assertEquals(excepted, Calculator.sum(a, b));
    }

    @RepeatedTest(3)
    public void testDivideByZero() {
        Exception exception = Assertions.assertThrows
                (ArithmeticException.class, () -> {
                    Calculator.divide(10, 0);
                });
        Assertions.assertEquals(exception.getMessage(), "На ноль делить нельзя");


    }

    @Test
    public void TestS() {
        Assertions.assertEquals(5, Calculator.sum(2, 3));

    }

    @ParameterizedTest
    @MethodSource("ProvideSum")
    public void TestMethod(double a, double b, double c) {
        Assertions.assertEquals(c,Calculator.sum(a,b));

    }

    @ParameterizedTest
    @MethodSource("ProvideSum")
    public void TestSum(double a,double b,double c){
        Assertions.assertThrows(ArithmeticException.class,()->{Calculator.divide(8,0);});
        Assertions.assertEquals(c,Calculator.divide(a,b));
    }

    static Object[][] ProvideSum() {
        return new Object[][]{
                {4, 2, 2},
                {8, 2, 10},
                {15, 20, 35}
        };

    }
    @Test
    public void Compare(){
        Assertions.assertTrue(Compare.CompareInt(2,3));
    }
}