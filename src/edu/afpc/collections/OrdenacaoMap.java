package edu.afpc.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<String, Book> myBooks = new LinkedHashMap<String, Book>(){{
            put("random book1", new Book("random book123", 125));
            put("random book2", new Book("random book456", 130));
            put("random book3", new Book("random book789", 405));
        }};
        for (Map.Entry<String, Book> livro : myBooks.entrySet()) {
            System.out.println(livro.getKey() + " " + livro.getValue().getName());
        }



    }
}

class Book {
    private final String name;
    private final int pages;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && Objects.equals(pages, book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
