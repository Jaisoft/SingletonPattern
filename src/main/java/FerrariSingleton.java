public class FerrariSingleton {

    //create an object of MainWindow
    private static FerrariSingleton instance = new FerrariSingleton();

    //make the constructor private so that this class cannot be
    //instantiated by other class
    private FerrariSingleton(){}

    //Get the only object available
    public static FerrariSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
