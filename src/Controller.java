import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.io.*;
import java.text.SimpleDateFormat;


public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private ListView listView;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;


    public void Agregar(ActionEvent actionEvent){
        FileChooser filechooser = new FileChooser();
        File select = filechooser.showOpenDialog(null);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files\\al.txt");
        File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files");

        if(select != null){

            listView.getItems().add(select.getAbsolutePath());
            System.out.println(sdf.format(file.lastModified()));
       }else{
            System.out.println("Error: Invalid File");
       }

    }

    public void abrir() throws IOException {
        String sour = listView.getSelectionModel().getSelectedItem().toString();
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        read.ReadFile(path);

        File source = new File(sour);
        File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files\\dest.txt");
        System.out.println(source);
        System.out.println(dest);
        copyFiles(source,dest);

    }

    private static void copyFiles(File source, File dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } finally {
            in.close();
            out.close();
        }
    }

    public void borrar(){
        int selected = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selected);
    }
}
