package Task3;

import java.util.Arrays;

public class Figure {
    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                ", name='" + name + '\'' +
                '}';
    }

    private Point[] points;
    String name;

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure(Point point1, Point point2, Point point3) {
        points = new Point[3];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        name = "триугольник";

    }


    public Figure(Point point1, Point point2, Point point3, Point point4) {
        points = new Point[4];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        name = "четырехугольник";

    }

    public Figure(Point point1, Point point2, Point point3, Point point4, Point point5) {
        points = new Point[5];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        points[4] = point5;
        name = "пятиугольник";

    }


    public double LengthSide(Point point1, Point point2)
    {
        double part1, part2;
        part1 = Math.abs(point1.getX() - point2.getX());
        part2 = Math.abs(point1.getY() - point2.getY());

        return Math.sqrt(part1*part1+part2*part2);
    }

    public double PerimeterCalculator()
    {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            perimeter += this.LengthSide(points[i], points[(i + 1) % points.length ]);
        }
        System.out.print("Периметр = ");
        return perimeter;
    }


}
