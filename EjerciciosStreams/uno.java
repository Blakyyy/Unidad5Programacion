package EjerciciosStreams;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class uno {
    public static void main(String[] args) {
        writeNum();
    }
    
    public static void writeNum(){
        File uno = new File("EjerciciosStreams/uno.txt");
        if(uno.exists()){
            try(FileWriter fw = new FileWriter(uno)) {
                for (int i = 0; i < 11; i++) {
                    fw.write(String.valueOf(i));
                }
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }
    }
}