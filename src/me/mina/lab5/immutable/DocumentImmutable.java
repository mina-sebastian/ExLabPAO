package me.mina.lab5.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class DocumentImmutable {


    private List<Page> pages;
    private String documentTitle;

    public DocumentImmutable(String documentTitle, List<Page> pages) {
        this.pages = new ArrayList<>(pages.stream()
                .map(page -> new Page(page.getTitle(), page.getText(), page.getNumber()))
                .toList());
        this.documentTitle = documentTitle;
    }

    public DocumentImmutable(String documentTitle) {
        this.pages = new ArrayList<>();
        this.documentTitle = documentTitle;
    }

    public List<Page> getPages() {
        return new ArrayList<>(pages.stream()
                .map(page -> new Page(page.getTitle(), page.getText(), page.getNumber()))
                .toList());
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    @Override
    public String toString() {
        return "Documentul imutabil '"+documentTitle+"': \n" +
                pages.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

}
