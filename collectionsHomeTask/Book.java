package collectionsHomeTask;

/*
1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.
 */

import java.util.LinkedList;
import java.util.Objects;

public class Book {
    private String authorName;
    private String bookName;
    private int pagesNumber;
    private double price;


    Book() {

    }

    private Book(String authorName, String bookName, int pagesNumber, double price) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.pagesNumber = pagesNumber;
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, pagesNumber, price);
    }

    @Override
    public String toString() {
        return
                "Автор: " + authorName +
                        ", Название: " + bookName +
                        ", Кол-во страниц: " + pagesNumber +
                        ", Цена: " + price + " USD";
    }

    public static void main(String[] args) {
        Book first = new Book("Stephen King", "It", 500, 40);
        Book second = new Book("Chuck Palahniuk", "Fight Club", 342, 30);
        Book third = new Book("Ernest Hemingway", "The Sun Also Rises", 421, 50);

        LinkedList<Book> books = new LinkedList<>();
        books.add(first);
        books.add(second);
        books.add(third);

        System.out.println("Список книг в коллекции:");

        for (int i = 0; i < books.size(); i++) {
            System.out.println("Книга " + (i + 1) + " - " + books.get(i));
        }

        System.out.println();
        System.out.println("Список книг после удаления второй из колекции:");

        books.remove(1);

        for (int i = 0; i < books.size(); i++) {
            System.out.println("Книга " + (i + 1) + " - " + books.get(i));
        }

    }
}
