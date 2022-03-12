package academy.javavode;


import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {

         List<String> list = new ArrayList<>();
         list.add("Hello");
          if (list instanceof List) {
              System.out.println("This is a list");
          }


        System.out.println(list.get(0).toUpperCase());

        List list1 = new ArrayList<>();
        list1.add(1);

    }

}
