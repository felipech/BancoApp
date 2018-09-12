package utlitario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //vamos a leer los datos del csv
    public static List<String[]> leer(String archivo){
        List<String[]> list = new LinkedList<>();
        String fila;
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            while ((fila = br.readLine()) != null){
                String[] grabarDatos = fila.split(",");
                list.add(grabarDatos);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo");
            e.printStackTrace();
        }
        return list;
    }
}
