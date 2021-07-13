/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private final ArrayList<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>();
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void publishedBooks(String book) {
        books.add(book);
    }

    @Deprecated
    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
