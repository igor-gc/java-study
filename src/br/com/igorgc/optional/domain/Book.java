package br.com.igorgc.optional.domain;

public class Book {
    private Integer id;
    private String title;
    private int pages;

    public Book(Integer id, String title, int pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}