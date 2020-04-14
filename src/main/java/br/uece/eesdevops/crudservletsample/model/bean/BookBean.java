package br.uece.eesdevops.crudservletsample.model.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookBean {

    private String id;
    private String title;
    private String author;
    private String resume;
    private String releaseYear;

    public BookBean() {}

    public BookBean(String title, String author, String resume, String releaseYear) {
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.releaseYear = releaseYear;
    }

    public String getId() {
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

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setId(String id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setAuthor(String author) { this.author = author; }

    public void setResume(String resume) { this.resume = resume; }

    public void setReleaseYear(String releaseYear) { this.releaseYear = releaseYear; }

}
