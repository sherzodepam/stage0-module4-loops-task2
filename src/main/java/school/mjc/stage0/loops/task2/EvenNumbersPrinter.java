package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int number=0;
        while(number<=printTillInclusive){
            System.out.println(number);
            number=number+2;
        }
    }
}
