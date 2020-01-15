package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {

    private Texture tx1;
    private Texture tx2;
    private Vector2 pos1;
    private Vector2 pos2;
    private int speed;

    public Background (){
        tx1 = new Texture("back.png");
        tx2 = new Texture("back.png");
        pos1 = new Vector2(0, 0);
        pos2 = new Vector2(800, 0);
        speed = 4;
    }

    public void render(SpriteBatch batch) {
        batch.draw(tx1, pos1.x, pos1.y);
        batch.draw(tx2, pos2.x, pos2.y);
    }

    public void update() {
        pos1.x -= speed;
        pos2.x -= speed;
        if (pos1.x < -800) {
            pos1.x = 0;
            pos2.x = 800;
        }
    }
}
