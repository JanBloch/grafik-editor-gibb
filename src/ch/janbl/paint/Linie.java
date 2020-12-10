package ch.janbl.paint;

import java.awt.*;

public class Linie extends Figur {
    private int toX;
    private int toY;

    public Linie(int x, int y, int toX, int toY) {
        super(x, y);
        this.toX = toX;
        this.toY = toY;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.drawLine(this.x, this.y, this.toX, this.toY);
    }
}
