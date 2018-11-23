package Week2JAVAPart2.Ex5;

import Week2JAVAPart2.Ex1.Article;

public class Editor {

    public Magazine writeMagazine(){

        Article article1 = new Article("title1", "text1");
        Article article2 = new Article("title2", "text2");
        Article article3 = new Article("title3", "text3");
        Magazine magazine = new Magazine("World Magazine");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);
        return magazine;
    }
}
