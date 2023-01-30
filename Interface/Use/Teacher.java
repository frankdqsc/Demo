package Interface.Use;

//The implementation class of the Smoking interface
public class Teacher implements Smoking{

    @Override
    public void smoke() {
        System.out.println("Smoking is harmful to health");
    }
}
