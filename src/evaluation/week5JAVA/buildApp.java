package evaluation.week5JAVA;

public class buildApp {
    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();
        System.out.println(tvTable);

    }
}
