import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        createFIle();
    }

    public static void createFIle(){
        File dir = new File("EjerciciosStreams");
        dir.mkdir();
        File java1 = new File("Directorio/uno.java");
        File java2 = new File("Directorio/dos.java");
        File java3 = new File("Directorio/tres.java");
        try {
            java1.createNewFile();
            java2.createNewFile();
            java3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}