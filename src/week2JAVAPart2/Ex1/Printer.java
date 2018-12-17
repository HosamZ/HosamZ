package week2JAVAPart2.Ex1;

import week2JAVAPart2.Ex5.Magazine;

import java.util.List;

public class Printer {

    public void print(Article article){
        System.out.println("the article title is : "+ article.getTitle());
        System.out.println("the article text is : "+ article.getText());
    }

    public void printMagazine(Magazine magazine){
        List<Article> articles = magazine.getArticles();
        for (Article article:articles
             ) {
            System.out.println(article.getTitle());
            System.out.println(article.getText());
        }

    }
}
