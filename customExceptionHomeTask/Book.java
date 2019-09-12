package customExceptionHomeTask;

/*
Создать класс (или заиспользовать существующий) Книга, поместить в список несколько книг. Написать метод, который будет
искать нужную книгу по различным параметрам , и в случае не нахождения нужного объекта бросать custom exception
(ResourceNotFoundException) который будет анчекд. В методе мейн необходимо его обработать и вывести на консоль
сообщение о зафейленном поиске.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private int pages;
    private String name;
    private int publishedDate;

    private Book(int pages, String author, int publishedDate) {
        this.pages = pages;
        this.name = author;
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return name +
                " (Год: " + publishedDate +
                ", К-во страниц: " + pages + ")";
    }

    private int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }

    private static void searchMethod(List<Book> list, int pagesFrom, int pagesTo) {
        System.out.print("Книга с кол-вом страниц - от " + pagesFrom + " до " + pagesTo + ":");
        Iterator<Book> i = list.iterator();
        int count = 0;
        while (i.hasNext()) {
            Book currentBook = i.next();
            if (currentBook.getPages() >= pagesFrom && currentBook.getPages() <= pagesTo) {
                System.out.print("" + '\n'  + currentBook);
                count++;
            }
        }
        if (count == 0) throw new ResourceNotFoundException();
    }

    private static void searchMethod(List<Book> list, int year) {
        System.out.print("Книга с годом пуюликации - " + year + ":");
        Iterator<Book> i = list.iterator();
        int count = 0;
        while (i.hasNext()) {
            Book currentBook = i.next();
            if (currentBook.getPublishedDate() == year) {
                System.out.print(""+ '\n' + currentBook);
                count++;
            }
        }
        if (count == 0) throw new ResourceNotFoundException();
    }

    private static void searchMethod(List<Book> list, String bookName) {
        System.out.print("Книга '" + bookName + "': ");
        Iterator<Book> i = list.iterator();
        int count = 0;
        while (i.hasNext()) {
            Book currentBook = i.next();
            if (currentBook.getName() == bookName) {
                System.out.print("" + '\n' + currentBook);
                count++;
            }
        }
        if (count == 0) throw new ResourceNotFoundException();
    }


    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(500, "Оно", 1980));
        books.add(new Book(300, "Евгений Онегин", 1812));
        books.add(new Book(126, "Звонок", 2004));


        try {
            searchMethod(books, "Оно");
            System.out.println();
        } catch (ResourceNotFoundException e) {
            System.out.println(e);
        }


    }


}
