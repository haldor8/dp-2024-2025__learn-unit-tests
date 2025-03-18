package fr.anthonyquere.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static List<String> startFizzBuzz(int count) {
        List<String> la_liste = new ArrayList<String>();

        for(int index = 1; index < count + 1; index++){
            String str_to_add = "";
            if(index%3 == 0){
                str_to_add += "Fizz";
            }
            if(index%5 == 0){
                str_to_add += "Buzz";
            }
            // System.out.println(str_to_add);
            la_liste.add(str_to_add);
        }

        return la_liste;
    }
}
