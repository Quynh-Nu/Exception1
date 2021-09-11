package Entities;

public class Diem {
    protected int x, y;

    public Diem() {
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
