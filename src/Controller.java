import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.io.*;
import java.text.SimpleDateFormat;
import javafx.stage.Stage;
import org.apache.commons.io.*;
import javax.swing.*;
/***
 * Clase Controller, encargada de la comunicacion entre la interfaz y la logica
 */

public class Controller {

    /***
     * Variables de la clase Controller
     */
    ArbolB tree = new ArbolB();
    @FXML
    private ListView listView;
    @FXML
    private AnchorPane anchid;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;

    /***
     * Metodo archivo, hecho para agragar un unico archivo a la biblioteca
     * @param
     * @return
     */
    public void archivo(){
        FileChooser filechooser = new FileChooser();
        File select = filechooser.showOpenDialog(null);

        if(select != null){
            listView.getItems().add(select.getAbsolutePath());
            File source = select.getAbsoluteFile();
            File dest = new File("Files");

            try {
                FileUtils.copyFileToDirectory(source, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }

       }else{
            System.out.println("Error: Invalid File");
       }

    }

    /***
     * Metodo carpeta, agrega los archivos de una carpeta a la bibliteca
     * @param
     * @return
     */
    public void carpeta(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        Stage stage = (Stage) anchid.getScene().getWindow();
        File select = directoryChooser.showDialog(stage);
        File source = select.getAbsoluteFile();
        File dest = new File("Files");

        if(select != null){
            File[] listOfFiles = select.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile()) {
                    listView.getItems().add(file.getAbsolutePath());
                }
            }

            try {
                FileUtils.copyDirectoryToDirectory(source, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Error: Invalid File");
        }

    }

    /***
     * Metodo abrir, devuelve el texto del documento
     * @param
     * @return
     */

    public void abrir(){
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        read.ReadFile(path);
    }


    /***
     * Metodo borrar, elimina el archivo selecionado de la biblioteca
     * @param
     * @return
     */
    public void borrar(){
        int selected = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selected);
    }

    /***
     * Metodo indexar, controlado por un boton en la interfaz grafica, es el encargado de generar el arbol basado en los documentos de la carpeta Files
     * @throws FileNotFoundException
     */
    public void indexar() throws FileNotFoundException {
        /***
         * Se crea un nuevo arbol, se obtiene la locacion de los archivos y se llama al metodo scan
         * Notese que el programa pregunta si el arbol esta vacio antes de indexar
         */
        if(tree.root == null){
            File[] Arr;
            File file = new File("Files");
            Arr = file.listFiles();
            for(File f:Arr){
                tree.scan(f);

            }
            System.out.println("Indexado");

        } else{
            System.out.println("Documentos ya indexados");
        }

    }

    /***
     * LLama al metodo buscar mediante un boton, el JOptionPane controla la palabra que se ingresara
     */
    public void buscar(){
        tree.Buscar(JOptionPane.showInputDialog("Ingresar palabra"));
    }
}
