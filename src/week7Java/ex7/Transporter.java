package week7Java.ex7;

import java.util.Scanner;

public class Transporter {
    public String vehiclesChecker(){
        System.out.println("please enter how many vehicles type~1 do you have? ");
        Scanner scanner = new Scanner(System.in);
        Integer answerVehiclesType1 = scanner.nextInt();
        System.out.println("please enter how many vehicles type~2 do you have? ");
        Integer answerVehiclesType2 = scanner.nextInt();
        System.out.println("please enter how many Celebrities? ");
        Integer celebritiesNumber  = scanner.nextInt();
        if (canTransportEveryone(answerVehiclesType1,answerVehiclesType2,celebritiesNumber)){
            return "We can transport all celebrities.";
        }
        else {
            return "We cannot transport all celebrities.";
        }

    }

    private Integer group(Integer number, Integer size , Integer maxTimes){
        Integer grouped = 0;
        while (number>size&&maxTimes>0){
            number = number-size;
            grouped = grouped + size;
            maxTimes = maxTimes-1;
        }
        return grouped;
    }
    public Boolean canTransportEveryone(Integer type1,Integer type2 , Integer celebrities) {
        celebrities = celebrities - group(celebrities,5,type2);
        celebrities= celebrities-group(celebrities,1,type1);
        if (celebrities==0){
            return celebrities.equals("can do it.");
        }
        return celebrities.equals("can`t do it.");
    }
}