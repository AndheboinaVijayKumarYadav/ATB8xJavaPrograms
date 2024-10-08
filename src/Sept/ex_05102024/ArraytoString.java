package Sept.ex_05102024;

public class ArraytoString {
    public static void main(String[] args) {
        String[] arr = new String[] {"This",
                "is", "the", "best", "and", "most",
                "detailed", "course", "on", "java", "on",
                "the", "internet"};

        StringBuilder sb = new StringBuilder();

        for (String str: arr){
            sb.append(str).append(" ");

        };

        System.out.println(sb);
    }
}
