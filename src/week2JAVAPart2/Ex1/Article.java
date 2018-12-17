package week2JAVAPart2.Ex1;

public class Article {
    public String title;
    public String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }
//    public String getTitle() {
//        System.out.println("please insert a title !");
//        Scanner scanner = new Scanner(System.in);
//        return title = scanner.nextLine();
//    }
//    public String getText() {
//        System.out.println("please tell me the text !");
//        Scanner scanner = new Scanner(System.in);
//        return text = scanner.nextLine();
//    }
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
