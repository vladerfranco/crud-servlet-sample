package br.uece.eesdevops.crudservletsample.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "resume")
    private String resume;

    @Column(name = "release_year")
    private Integer releaseYear;

    public Book() {}

    public Book(String title, String author, String resume, Integer releaseYear) {
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.releaseYear = releaseYear;
    }

    public Book(Long id, String title, String author, String resume, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.releaseYear = releaseYear;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getResume() {
        return resume;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setId(Long id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setAuthor(String author) { this.author = author; }

    public void setResume(String resume) { this.resume = resume; }

    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                Objects.equals(resume, book.resume) &&
                Objects.equals(releaseYear, book.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, resume, releaseYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", resume='" + resume + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
