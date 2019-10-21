import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;


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
        //File source = (File) listView.getSelectionModel().getSelectedItem();
        //File dest = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Proyecto2\\Files");
        //FileChannel sourceChannel = null;
        //FileChannel destChannel = null;


        if(select != null){
            listView.getItems().add(select.getAbsolutePath());
            //try {
              //  sourceChannel = new FileInputStream(source).getChannel();
                //destChannel = new FileOutputStream(dest).getChannel();
                //destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            //}finally{
              //  sourceChannel.close();
               // destChannel.close();
            //}


       }else{
            System.out.println("Error: Invalid File");
       }

    }

    public void abrir(){
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        read.ReadFile(path);
        System.out.println(path);
    }

    public void borrar(){
        int selected = listView.getSelectionModel().getSelectedIndex();
        listView.getItems().remove(selected);
    }
}
