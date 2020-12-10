package ch.janbl.paint;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Display display = new Display();


    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(0, 0, 100, 100);
        Kreis kreis = new Kreis(20, 20, 10);
        Linie linie = new Linie(20, 20, 20, 100);
        List<Figur> gruppeList = new ArrayList<Figur>();
        gruppeList.add(new Ellipse(1, 1, 50, 100));
        Gruppe g = new Gruppe(300, 100, gruppeList);
        display.hinzufuegen(rechteck);
        display.hinzufuegen(kreis);
        display.hinzufuegen(g);
        display.hinzufuegen(linie);

    }
}
