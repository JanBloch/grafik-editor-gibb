package ch.janbl.paint;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.ArrayList;

public class Gruppe extends Figur {
    private List<Figur> figurList;


    public Gruppe(int x, int y, List<Figur> figurList) {
        super(x, y);
        this.figurList = figurList;
    }

    @Override
    public void draw(Graphics2D graphics) {

        AffineTransform transform = graphics.getTransform();
        transform.translate(this.x, this.y);
        graphics.transform(transform);

        this.figurList.forEach(v -> {
            v.draw(graphics);
        });
        transform.translate(-this.x * 2, -this.y * 2);
        graphics.transform(transform);

    }

}
