package Task1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.printJobTitle();

        Worker worker = new Worker();
        worker.printJobTitle();

        Accountant accountant = new Accountant();
        accountant.printJobTitle();
    }
}