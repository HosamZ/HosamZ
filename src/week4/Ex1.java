package week4;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<String> books = getBookTitles();
        List<String> box = new ArrayList<>();

//        System.out.println("Book titles : "+ books);
//        String book = peek(books);
//        System.out.println(book);
//        List<String> book1 = pop(books);
//        System.out.println(book1);
//        List<String> book2 = push(box,book);
//        System.out.println(book2);
         while (books.size()>0) {
            String book = peek(books);
            books = pop(books);
            box = push(box, book);
            System.out.println("The title of this book is " + book);
         }
         List<String> bookShelf = new ArrayList<>();
         while (box.size()>0){
            String book = peek(box);
            box = pop(box);
            bookShelf = push(bookShelf,book);
            System.out.println("The title of this book is  "+book);

         }



    }



    public static String peek(List<String> elements) {

        Integer size = elements.size();
        return elements.get(size-1);
    }
    public static List<String> pop(List<String> elements) {

        Integer size = elements.size();
        if (size==0);
            elements.remove(size-1);
            return elements;
    }
    public static List<String> push(List<String> elements, String string){

        elements.add(string);
        return elements;
    }
    public static List<String> getBookTitles(){
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("Physics");
        bookTitles.add("Math");
        bookTitles.add("Programing");
        bookTitles.add("History");
        return bookTitles;
    }
}
