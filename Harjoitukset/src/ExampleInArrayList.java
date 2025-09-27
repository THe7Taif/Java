/*
Example in ArrayList Collecyions
 */

import java.util.ArrayList;

public class ExampleInArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("ali");
        names.add("james");
        names.add("Sara");

        // we can use this type of for loop.
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // or we can use this type of for loop.
        for (String name : names) {
            System.out.println(name);
        }

    }
}
