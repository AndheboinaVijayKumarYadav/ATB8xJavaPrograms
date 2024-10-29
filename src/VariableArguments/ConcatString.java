package VariableArguments;

public class ConcatString {
    public static StringBuilder concatString(String... args){
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(" ");
        }

        return sb;
    }
    public static void main(String[] args) {
        StringBuilder sb = concatString("vijay","is","a","good","boy");
        System.out.println(sb);
    }
}
