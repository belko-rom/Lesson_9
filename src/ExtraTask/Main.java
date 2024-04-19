package ExtraTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Ромео", 29);
        System.out.println("Настоящий человек: " + person1);

        Person person2 = (Person) person1.clone();
        System.out.println("Клонированный человек: " + person2);

    }
}
/* Интерфейс Cloneable в Java является маркерным интерфейсом, который служит для указания того,
 что объект можно клонировать с использованием метода clone(). Для того чтобы показать пример
 работы этого интерфейса, давайте создадим класс Person, который будет реализовывать интерфейс Cloneable:

 В данном примере мы создаем класс Person, который реализует интерфейс Cloneable. Мы определяем метод clone(),
 который вызывает метод Object.clone() для создания глубокой копии объекта. В методе main() мы создаем объект
 Person и клонируем его, выводим информацию о настоящем объекте и его клоне.

При запуске этого примера мы увидим, что оригинальный объект Person и его клон имеют одинаковое состояние.
 */