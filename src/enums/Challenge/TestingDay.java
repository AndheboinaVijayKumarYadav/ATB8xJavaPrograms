package enums.Challenge;

public class TestingDay {
    public static void main(String[] args) {
        System.out.println("Value of Day enum");
        for (Day value : Day.values()) {
            System.out.printf("%s %s \n",value,value.getType());
        }
    }
}
