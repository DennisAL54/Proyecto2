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

public class Controller {
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

    public void archivo(){
        FileChooser filechooser = new FileChooser();
        File select = filechooser.showOpenDialog(null);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        if(select != null){
            listView.getItems().add(select.getAbsolutePath());
            File source = select.getAbsoluteFile();
            File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files");
            System.out.println(sdf.format(dest.lastModified()));
            System.out.println(source);
            System.out.println(dest);

            try {
                FileUtils.copyFileToDirectory(source, dest);
                System.out.println(source.length());
            } catch (IOException e) {
                e.printStackTrace();
            }

       }else{
            System.out.println("Error: Invalid File");
       }

    }

    public void carpeta(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        Stage stage = (Stage) anchid.getScene().getWindow();
        File select = directoryChooser.showDialog(stage);
        File source = select.getAbsoluteFile();
        File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files");

        if(select != null){
            File[] listOfFiles = select.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile()) {
                    listView.getItems().add(file.getAbsolutePath());
                    System.out.println(file.getName());
                }
            }

            try {
                FileUtils.copyDirectoryToDirectory(source, dest);
                System.out.println(source.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void abrir(){
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        read.ReadFile(path);
    }


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
         */
        File[] Arr;
        ArbolB tree = new ArbolB();
        File file = new File("Files");
        Arr = file.listFiles();
        for(File f:Arr){
            tree.scan(f);

        }
        System.out.println("Indexado");

    }

    /***
     * LLama al metodo buscar mediante un boton, el JOptionPane controla la palabra que se ingresara
     */
    public void buscar(){
        tree.Buscar(JOptionPane.showInputDialog("Ingresar palabra"));

    }
}
