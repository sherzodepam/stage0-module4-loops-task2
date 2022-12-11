package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int firstPrinted = 0;
        int result = 0;
        if (multiplyByAndToInclusive < 0) {
            while (firstPrinted >= multiplyByAndToInclusive) {
                result = (-1) * firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted--;
            }
        } else if (multiplyByAndToInclusive > 0) {
            while (firstPrinted <= multiplyByAndToInclusive) {
                result = firstPrinted * multiplyByAndToInclusive;
                System.out.println(result);
                firstPrinted++;
            }
        }
    }
}
