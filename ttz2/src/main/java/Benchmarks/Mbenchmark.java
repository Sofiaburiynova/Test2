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
    @Benchmark
    public void test_sum10() {
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_sum100() {
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_min10(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_min100(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._min(arr);
    }
    @Benchmark
    public void test_max10(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_max100(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._max(arr);
    }
    @Benchmark
    public void test_mult10(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 100; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 41 - 20;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    @Benchmark
    public void test_mult100(){
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i = 0; i < 1000; i++) {
            Random random = new Random();
            Double randomNumber = random.nextDouble() % 21 - 10;
            arr.add(randomNumber);
        }
        Main._sum(arr);
    }
    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(org.example.Main.class.getSimpleName())
                .warmupTime(TimeValue.seconds(2))
                .measurementTime(TimeValue.seconds(2))
                .warmupIterations(3)
                .measurementIterations(3)
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(opt);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {}
    }
}