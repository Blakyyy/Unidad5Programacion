package EjerciciosStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tres {

    public static void main(String[] args) {
        directorioTelefonico();
    }

    public static void directorioTelefonico(){
        File datos = new File("/Users/dk/Desktop/Unidad5_Caso1/EjerciciosStreams/datos.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(datos))) {
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
