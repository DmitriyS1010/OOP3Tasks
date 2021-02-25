package Task3;

public class Point {

    private int x;
    private int y;
    private String name;


    public Point (int x,int y,String name){

        this.x=x;
        this.y=y;
        this.name=name;

    }
    public Point (int x,int y){

        this.x=x;
        this.y=y;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}