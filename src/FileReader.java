import java.io.*;
import java.util.*;

public class FileReader {
    public String x = "";

    public void ReadFile(String x) {
        //Busca archivo .txt e imprime su contenido
        try {
            File file = new File(x);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            //Lanza exepcion si no encuentra el documento
        } catch (Exception e) {
            System.out.println("Error: File not found");
        }
    }
}
