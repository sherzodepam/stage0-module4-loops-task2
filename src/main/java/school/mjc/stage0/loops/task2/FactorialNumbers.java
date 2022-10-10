package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a = 1;
        System.out.println(1);
        for (int i = 1; i <= printToInclusive; i++) {
            System.out.println(a *= i);


        }
    }
}