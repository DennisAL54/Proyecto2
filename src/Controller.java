import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.io.*;
import java.text.SimpleDateFormat;
import org.apache.commons.io.*;

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
        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        if(select != null){
            listView.getItems().add(select.getAbsolutePath());
            //System.out.println(sdf.format(file.lastModified()));
            File source = select.getAbsoluteFile();
            File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files");
            System.out.println(source);
            System.out.println(dest);

            try {
                FileUtils.copyFileToDirectory(source, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }

       }else{
            System.out.println("Error: Invalid File");
       }



    }

    public void abrir() throws IOException {
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        read.ReadFile(path);

    }


    public void borrar(){
        int selected = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selected);
    }
}
