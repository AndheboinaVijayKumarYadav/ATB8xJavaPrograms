package Sept.ex_05102024;

import java.io.FilterOutputStream;

public class Final {
    final String name;

    Final(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Final user = new Final("Vijay");
        System.out.println(user.name);
    }
}
