package me.mina.lab5.immutable;

public class Page {

    private String title;
    private String text;
    private int number;

    public Page(String title, String text, int number) {
        this.title = title;
        this.text = text;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Page{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
