package evaluation.week2Reflection;

public class PostOfficeAssistant {

    public void stamp(Letter letter){

        letter.setStamped(true);

    }
    public void send(Letter letter){

        System.out.println("did you stomp the letter ?"+letter.getAddress());
        if ( letter.getStamped()){
            System.out.println("we will send the letter to the address!!");
        }else{
            System.out.println("Sorry, you need to stamp it first!!");
        }
    }
}
