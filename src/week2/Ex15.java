package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
 public class Ex15 {


    public static void main(String[] args) {
        ArrayList<String> clothes = new ArrayList<String>();

        clothes.add("blouse");
        clothes.add("sneakers");
        clothes.add("tie");
        clothes.add("sandals");
        clothes.add("jeans");
        clothes.add("short pants");
        clothes.add("tank");
        clothes.add("blazer");



        //        ("blouse","sneakers","tie","sandals","jeans","short pants","tank","blazer");


        System.out.println(clothes);

        String tank = clothes.get(6);
        String shortpants = clothes.get(5);
        String sneakers = clothes.get(1);


        System.out.println("Hansel will wear a "+tank+","+shortpants+" and "+sneakers);




    }
 }
