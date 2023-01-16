package edu.greenriver.sdev.firstspring.services;

import edu.greenriver.sdev.firstspring.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * This class will have our business logic
 */
@Service
public class BookService {
    private List<Book> booksList = List.of(
            new Book("Andrzej Sapkowski", "The Sword of Destiny", 384),
            new Book("Randal Garret", "Lord d'Arcy Investigates", 229),
            new Book("Joseph Murphy", "Powers of the Subconscious Mind", 387),
            new Book("Frank Herbert", "Dune", 412)
    );

    public List<Book> getEveryBook(){
        return booksList;
    }

    public Book random(){
        Random random = new Random();
        int randomIndex = random.nextInt(booksList.size());
        return booksList.get(randomIndex);
    }

    public Book byName(String name){
        return booksList.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(name))
                .findFirst()
                .get();
    }

    public List<Book> byPages(int minPages){
        return booksList.stream()
                .filter(book -> book.getPages() >= minPages)
                .toList();
    }
}
