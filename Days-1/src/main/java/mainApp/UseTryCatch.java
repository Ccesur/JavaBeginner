package mainApp;

import java.io.File;

public class UseTryCatch {

    public static void main(String[] args) {

        String stAge = "ali";


        try {
            int age = Integer.parseInt(stAge);
            age += 10; // age = age + 10
            System.out.println("Age: " + age);
        } catch (Exception ex) {
            System.err.println(ex.toString());
            System.out.println("Lütfen sadece tam sayı giriniz!");

        }

        File file = new File("sample.txt");
        try {
            file.createNewFile();
            //file.exists();
        } catch (Exception ex){
            System.err.println(ex);
            //file.exists();
        } finally {
            file.exists(); // hata alsa da almasa da kapanır
        }

        System.out.println("This line call");
    }
}
