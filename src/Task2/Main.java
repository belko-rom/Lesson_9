package Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_2");
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(3.2);//20,096
        figures[1] = new Triangle(2, 5, 2.1);//9,1
        figures[2] = new Triangle(1, 5, 9);//15
        figures[3] = new Rectangle(10, 15);//50
        figures[4] = new Triangle(4, 6, 2.7);//12,7

        double sumPerimeter = 0;

        for (Figure figure : figures) {
            sumPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве: " + sumPerimeter);

    }
}
