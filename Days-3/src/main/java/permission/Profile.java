package permission;

public class Profile {

    public static String city = ""; //istenilen her yerde erişebilirsin ama bellekte kalıcı yer kaplar

    Action action = new Action();

    public void call(){
        System.out.println(action.surname);
    }
}
