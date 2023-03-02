package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {


        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);

        //To get all the keys we can use keySet Method from Map interface
       Set<String> allkeys=makeup.keySet();
       // System.out.println(allkeys);

      //  for(String s: allkeys){
          //  System.out.println(s);


        //Delete all the entries from the map for which the size of key is greater than 7
            allkeys.removeIf(x->x.length()>7);
            System.out.println(allkeys);

            System.out.println(makeup);
        }


    }


