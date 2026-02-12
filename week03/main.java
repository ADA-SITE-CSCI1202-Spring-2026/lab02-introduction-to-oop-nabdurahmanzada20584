package week03;

import week03.geometry.Point;
import week03.geometry.Segment;

public class main {

    public static void main(String[] args) {
        Segment s = new Segment(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println(s.getP1().getX());
        System.out.println(s.getP1().getY());
        System.out.println(s.getP2().getX());
        System.out.println(s.getP2().getY());

        System.out.println("-------------");

        s.setP1(new Point(5.5f, 6.6f));
        s.setP2(new Point(7.7f, 8.8f));
        System.out.println(s.getP1().getX());
        System.out.println(s.getP1().getY());
        System.out.println(s.getP2().getX());
        System.out.println(s.getP2().getY());

        System.out.println("-------------");

        s.getP1().setX(9.9f);
        s.getP1().setY(10.10f);
        s.getP2().setX(11.11f);
        s.getP2().setY(12.12f);
        System.out.println(s.getP1().getX());
        System.out.println(s.getP1().getY());
        System.out.println(s.getP2().getX());
        System.out.println(s.getP2().getY());

    }
}
