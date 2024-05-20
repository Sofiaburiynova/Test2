import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    @Test
    public void test_1_sum_1() {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(1d);
        arr.add(2d);
        arr.add(3d);
        double result = Main._sum(arr);
        Assertions.assertEquals(6d, result);

    }

    @Test
    public void test_2_max_1(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(1.0);
        arr.add(2.0);
        arr.add(3.0);
        double result = Main._max(arr);
        Assertions.assertEquals(3.0, result);
    }
    @Test
    public void test_3_min_1(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(10.0);
        arr.add(5.0);
        arr.add(8.0);

        double result = Main._min(arr);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void test_4_min_2(){
        ArrayList<Double> arr  = new ArrayList<>();
        arr.add(1035.0);
        arr.add(-1.0);
        arr.add(2.11);
        double result = Main._min(arr);
        Assertions.assertEquals(-1.0, result);

    }
    @Test
    public void test_5_max_2(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(101.1);
        arr.add(101.11);
        arr.add(100.0);
        double result = Main._max(arr);
        Assertions.assertEquals(101.11, result);
    }
    @Test
    public void test_6_sum_2(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(12d);
        arr.add(10d);
        arr.add(1d);
        arr.add(103d);
        double result = Main._sum(arr);
        Assertions.assertEquals(126d, result);
    }
    @Test
    public void test_7_mult_1(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(1d);
        arr.add(2d);
        arr.add(3d);
        arr.add(4d);
        double result = Main._mult(arr);
        Assertions.assertEquals(24d, result);
    }
    @Test
    public void test_8_mult_2(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(100d);
        arr.add(20d);
        arr.add(30000d);
        double result = Main._mult(arr);
        Assertions.assertEquals(60000000d, result);
    }
    @Test
    public void test_9_mult_3(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(33d);
        arr.add(313d);
        arr.add(345679999d);
        double result = Main._mult(arr);
        Assertions.assertEquals(3570528709671d, result);
    }
    @Test
    public void test_10_mult_4(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(3.0);
        arr.add(2.1);
        arr.add(2.2);
        double result = Main._mult(arr);
        Assertions.assertEquals(13.86, result, 0.0000000000001);
    }
    @Test
    public void test_11_sum_3(){
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(1.1);
        arr.add(2.1);
        arr.add(2.2);
        double result = Main._sum(arr);
        Assertions.assertEquals(5.4, result, 0.0000000000001);
    }

}




