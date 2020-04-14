package br.uece.eesdevops.crudservletsample.service;

import br.uece.eesdevops.crudservletsample.model.Book;
import br.uece.eesdevops.crudservletsample.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository = new BookRepository();

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    public void updateBook(Book book) {
        bookRepository.updateBook(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
    }

    public Book getBook(Long id) {
        return bookRepository.getBook(id);
    }
}
