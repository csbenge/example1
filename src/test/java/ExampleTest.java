package test.java;

import example.java.Example;

class ExampleTest {
    public static void main(String[] args) {
        int n = 12;
        int sq = Example.squareIt(n);
        assert sq == (n * n) : "Fail";
        System.out.println("n = " + n + " sq = " + sq);
    }
}