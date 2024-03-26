package me.mina.lab5.immutable;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Page pag1 = new Page("Titlu pagina 1", "", 1);
        Page pag2 = new Page("Continuare pagina 1", "", 2);
        Page pag3 = new Page("Continuare pagina 1", "", 3);
        Page pag4 = new Page("Titlu pagina 2", "", 4);
        Page pag5 = new Page("Continuare pagina 2", "", 5);
        Page pag6 = new Page("Continuare pagina 2", "", 6);
        Page pag7 = new Page("Continuare pagina 2", "", 7);

        List<Page> pages = new ArrayList<>();
        pages.add(pag1);
        pages.add(pag2);
        pages.add(pag3);
        pages.add(pag4);
        pages.add(pag5);
        pages.add(pag6);
        pages.add(pag7);

        DocumentImmutable documentImmutable = new DocumentImmutable("Document important", pages);
        Document document = new Document("Document nu asa important", pages);

        //TEST
        documentImmutable.getPages().remove(pag1);
        System.out.println(documentImmutable);
        System.out.println();
//        document.getPages().remove(pag1);
        pag1.setText("Documentul este mutabil!");
        System.out.println(document);
        System.out.println();
        System.out.println(documentImmutable);
    }
}
