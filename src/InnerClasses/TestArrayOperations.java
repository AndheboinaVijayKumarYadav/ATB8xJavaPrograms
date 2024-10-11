package InnerClasses;

public class TestArrayOperations {
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations(new int[] {1,3,5,9});

        ArrayOperations.Statistics statistics = obj.new Statistics();

        System.out.println(statistics.mean());

        // Since Statistics is static, we don't need an instance of ArrayOperations to create it.
        // ArrayOperations.Statistics stats = new ArrayOperations.Statistics();
        // Calculate the mean by passing the numbers array
        // double mean = stats.mean(arrayOps.numbers);
    }
}
