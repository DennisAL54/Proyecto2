import java.io.*;
import java.util.*;

/***
 * Clase FileReader, le un archivo de texto y devuelve su contenido
 */
public class FileReader {
    public String x = "";

    /***
     * Metodo ReadFile, devuelve el contenido de un archivo de texto
     * @param path Direccion del documento que se deasea leer
     * @return String con el contenido del archivo
     */
    public void ReadFile(String path) {
        //Busca archivo .txt e imprime su contenido
        try {
            File file = new File(path);
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
