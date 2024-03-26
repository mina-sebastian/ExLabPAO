package me.mina.lab5.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Document {

    private List<Page> pages;
    private String documentTitle;

    public Document(String documentTitle, List<Page> pages) {
        this.pages = pages;
        this.documentTitle = documentTitle;
    }

    public Document(String documentTitle) {
        this.pages = new ArrayList<>();
        this.documentTitle = documentTitle;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void addPage(Page page){
        this.pages.add(page);
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    @Override
    public String toString() {
        return "Documentul '"+documentTitle+"': \n" +
                pages.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"));
    }
}
