package Week2JAVAPart2.Ex5;

import Week2JAVAPart2.Ex1.Printer;

public class MagazineApplication {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }
}
