package useThread;

public class Action extends Thread {

    private String imagePath = " ";


    public Action(String imagePath) {
        this.imagePath = imagePath;
    }


    @Override
    public void run() {


        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(500);
                System.out.println("This line call");
            }
        } catch (Exception ex) {}


    }
}
