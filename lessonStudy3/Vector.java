package lessonStudy3;

import java.util.Objects;

public class Vector {
    double x;
    double y;
    double z;

    Vector(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    double scalar(Vector o) {
        return o.x * x + o.y * y + o.z * z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 &&
                Double.compare(vector.y, y) == 0 &&
                Double.compare(vector.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    Vector vScalar(Vector o) {
        return new Vector(
                y * o.z - o.y * z,
                z * o.x - o.z * x,
                x * o.y - y * o.x
        );
    }
}


class VectorDemo {
    public static void main(String[] args) {
        Vector test = new Vector(2, 3, 4);
        Vector test2 = new Vector(5, 6, 7);

        Vector [] t = new Vector [3];
        t [1]= new Vector (1,3,4);
        System.out.println(t[2].x);

        System.out.println(test2.scalar(test));
        System.out.println(test2.length());

        System.out.println("New elements");
        System.out.println(test.vScalar(test2).x);
        System.out.println(test.vScalar(test2).y);
        System.out.println(test.vScalar(test2).z);
    }
}
