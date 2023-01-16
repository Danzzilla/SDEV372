package edu.greenriver.sdev.firstspring;

import edu.greenriver.sdev.firstspring.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);

        Book book = new Book("Andrzej Sapkowski", "The Sword of Destiny", 384);

        Book defaultBook = new Book();

        Book builtBook = Book.builder()
                .author("Randal Garret")
                .title("Lord d'Arcy Investigates")
                .pages(229)
                .build();
    }

}
