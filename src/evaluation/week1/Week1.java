package evaluation.week1;

import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        int moneyOfDerek = calculateMoneyInPocket();
        int total = howMuchMoneyDoYouHave();
        if(total<= moneyOfDerek){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static Integer howManyFriendsComing () {

            System.out.println("How many friends are coming with me ?");
            Scanner scanner = new Scanner(System.in);
            Integer numberOfFriends = scanner.nextInt();
            return numberOfFriends;
    }



        public static Integer howMuchMoneyDoYouHave() {

            Integer counter = 0;
            Integer total = 0;
            int friends = howManyFriendsComing();
            while (counter < friends){
                System.out.println("how much money do you have to pay ?");
                Scanner scanner = new Scanner(System.in);
                Integer number = scanner.nextInt();
                total = total + number;
                counter++;



            }

            return total;

        }




        public static Integer calculateMoneyInPocket () {

            System.out.println("How much money do i have?");
            Scanner scanner = new Scanner(System.in);
            Integer result = scanner.nextInt();
            return result;
        }



}