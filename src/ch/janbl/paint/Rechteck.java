package ch.janbl.paint;

import java.awt.*;

public class Rechteck extends Figur {
    private int width;
    private int height;

    public Rechteck(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.drawRect(this.x, this.y, this.width, this.height);
    }
}
