package evaluation.week2Reflection;

public class PostOfficeApplication {

    public static void main(String[] args) {
        Letter letter = new Letter("Street1",false);
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();

            postOfficeAssistant.send(letter);

    }
}
