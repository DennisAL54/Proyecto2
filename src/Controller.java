import com.sun.glass.ui.CommonDialogs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.awt.*;
import java.io.File;

public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private ListView listView;


    public void Buscar(ActionEvent actionEvent) {
        FileChooser filechooser = new FileChooser();
        File select = filechooser.showOpenDialog(null);
        filechooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF files","*.pdf"));
        filechooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text files","*.txt"));
        filechooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("DOC files","*.doc"));

        if(select != null){
            listView.getItems().add(select.getName());
        }else{
            System.out.println("Error: Invalid File");
        }

    }
}
