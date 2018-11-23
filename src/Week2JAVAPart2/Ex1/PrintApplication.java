package Week2JAVAPart2.Ex1;

public class PrintApplication {

    public static void main(String[] args) {

        Article article = new Article("title","text");
        Printer print = new Printer();
        print.print(article);

    }
}
