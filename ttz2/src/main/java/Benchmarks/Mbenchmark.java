package Benchmarks;
import org.example.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Mbenchmark {
    public static void main(String[] args) {
        Options option = new OptionsBuilder()
                .include(org.example.Main.class.getSimpleName())
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .warmupIterations(3)
                .measurementIterations(3)
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(option);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {}
    }
    @Benchmark
    public void test_sum_1() {
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_sum_2() {
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_min_3(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_min_4(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_max_5(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_max_6(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_mult_7(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_mult_8(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }

}
