package cn.bdqn.test;

import java.io.Serializable;

public class User implements Serializable {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
