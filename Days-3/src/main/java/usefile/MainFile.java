package usefile;

import permission.Profile;

public class MainFile {

    public static void main(String[] args) {

        //Manager manager = new Manager("sample1");
        Manager manager = new Manager();
        //manager.createFile();
        //manager.deleteFile();
        //manager.addLine("new data t");
        manager.readFile();

        Profile.city = "Ankara";

    }
}
