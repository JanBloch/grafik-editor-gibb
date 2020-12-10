package ch.janbl.paint;

import java.awt.*;

public class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.drawOval(this.x, this.y, this.radius, this.radius);
    }
}
