import java.awt.*;
import java.net.PortUnreachableException;
/**
 Класс Lab1 принимает от пользователя значения координат для трех трехмерных точек, на основе этих данных вычисляет
 площадь треугольника, образованного этими точками и выводит результат в командную строку
 **/
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        /**
         Принимаем значения из командной строки
         **/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату X для точки A: ");
        double onePointX = in.nextDouble();
        System.out.println("Введите координату Y для точки A: ");
        double onePointY = in.nextDouble();
        System.out.println("Введите координату Z для точки A: ");
        double onePointZ = in.nextDouble();

        System.out.println("Введите координату X для точки B: ");
        double secondPointX = in.nextDouble();
        System.out.println("Введите координату Y для точки B: ");
        double secondPointY = in.nextDouble();
        System.out.println("Введите координату Z для точки B: ");
        double secondPointZ = in.nextDouble();

        System.out.println("Введите координату X для точки C: ");
        double thirdPointX = in.nextDouble();
        System.out.println("Введите координату Y для точки C: ");
        double thirdPointY = in.nextDouble();
        System.out.println("Введите координату Z для точки C: ");
        double thirdPointZ = in.nextDouble();

        /**
         Создание трех точек
         **/
        Point3d onePoint = new Point3d(onePointX,onePointY,onePointZ);
        Point3d secondPoint = new Point3d(secondPointX, secondPointY, secondPointZ);
        Point3d thirdPoint = new Point3d(thirdPointX, thirdPointY, thirdPointZ);
        /**
         Проверка на равенство двух точек
         **/
        boolean pointsComparison = ((onePoint.comparison(secondPoint))||
                (secondPoint.comparison(thirdPoint))||
                (onePoint.comparison(thirdPoint)));
        /**
         Здесь проводится проверка на равенство двух точек, если одна из точек равна другой, выводится ошибка
         В противном случае, проводитеся вычисление и выводятся значения сторон треугольника и его площадь
         **/
        if (pointsComparison){
            System.out.println("Одна из точек равна другой!");
        }
        else{
            System.out.println("Сторона a = " + onePoint.distanceTo(secondPoint));
            System.out.println("Сторона b = " + onePoint.distanceTo(thirdPoint));
            System.out.println("Сторона c = " + secondPoint.distanceTo(thirdPoint));
            System.out.println("Площадь треугольника равна: " + computeArea(onePoint, secondPoint, thirdPoint));
        }
    }
    /**
     Класс computeArea принимает значения созданных объектов point3d, вычисляет длину стороны треугольника с помощью
     методоа distanseTo, и вычисляет площадь треугольника по формуле Герона
     **/
    public static double computeArea(Point3d onePoint, Point3d secondPoint, Point3d thirdPoint){
        double a = onePoint.distanceTo(secondPoint);
        double b = onePoint.distanceTo(thirdPoint);
        double c = secondPoint.distanceTo(thirdPoint);
        double P = (a + b + c)/2;
        System.out.println("Полупериметр треугольника равен: " + P);
        double S = Math.sqrt(P*(P-a)*(P-b)*(P-c));
        return S;
    }
}
