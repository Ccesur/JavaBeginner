package useThread;

public class UseMainThread {

    public static void main(String[] args) {

        Action ac1 = new Action("1.jpg");
        ac1.start();

        Action ac2 = new Action("2.jpg");
        ac2.start();

        Action ac3 = new Action("3.jpg");
        ac3.start();

        System.out.println("Line code call");


    }
}