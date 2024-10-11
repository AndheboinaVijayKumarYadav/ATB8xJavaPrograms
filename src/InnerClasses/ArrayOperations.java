package InnerClasses;

public class ArrayOperations {
    private int[] numbers;

    // Constructor


    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    // demo of inner class without static
    public class Statistics {

        double mean(){
            // this method can directly access the numbers array defined in step 4
            double sum = 0;
            for(int number: numbers){
                sum += number;
            }

            return (sum/numbers.length);
        }

        public static class Statistics1 {

            // Since the inner class is static, it doesn't have direct access to instance variables (like numbers).
            // We need to pass the array as a parameter to this method.
            double mean(int[] numbers) {
                double sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                return sum / numbers.length;
            }
        }

    }
}
