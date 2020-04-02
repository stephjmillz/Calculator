import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){

        //Given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;


        int expected = 3;

        //When
        int actual = calculator.add(x,y);


        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void addTest2(){

        Calculator calculator2 = new Calculator();
        int k = 2;
                int z = 1;

                int expected2 = 1;

                int actual2 = calculator2.subtract(k,z);

                Assert.assertEquals(expected2,actual2);

    }


    @Test
    public void addTest3(){
        Calculator calculator3 = new Calculator();
        int c = 5;
                int l = 7;

                int expected3 = 35;

                int actual3 = calculator3.multiply(c,l);

                Assert.assertEquals(expected3, actual3);

    }


    @Test
    public void addTest4(){
        Calculator calculator4 = new Calculator();

        int g = 30;
        int y = 5;

        int expected4 = 6;

        int actual4 = calculator4.divide(g,y);

        Assert.assertEquals(expected4,actual4);

    }

    @Test
    public void addTest5(){
        Calculator calculator5 = new Calculator();

        int r = 8;
        int s = 3;

        int expected5 = 512;

        int actual5 = calculator5.exponent(r,s);

        Assert.assertEquals(expected5,actual5);
    }
}
