package com.ironhack.d2;

import com.ironhack.w2.d2.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getHarryPotter_noParams_correctBook(){
        Book expectedBook = new Book(5678, "Harry Potter", "J.K. Rowling", 1997);

        assertEquals(expectedBook, Book.getHarryPotter());
    }
}