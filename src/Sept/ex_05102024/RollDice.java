package Sept.ex_05102024;

public class RollDice {

    static int roll(){
        return (int) Math.floor( 1 + (Math.random() * 6));
    }
    public static void main(String[] args) {
        int value = RollDice.roll();
        System.out.println("Value for first roll is "+ value);
    }
}
