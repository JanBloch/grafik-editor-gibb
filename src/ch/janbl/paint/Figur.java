package ch.janbl.paint;

import java.awt.*;

public abstract class Figur {
    protected int x;
    protected int y;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics2D graphics);
}
