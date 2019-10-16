import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import java.io.File;
import java.util.Observable;

public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private ListView listView;
    @FXML
    private Button btn2;


    public void Buscar(ActionEvent actionEvent) {
        FileChooser filechooser = new FileChooser();
        File select = filechooser.showOpenDialog(null);
        filechooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF files","*.pdf"),
                                                 new FileChooser.ExtensionFilter("Text files","*.txt"),
                                                 new FileChooser.ExtensionFilter("DOC files","*.doc"));

        if(select != null){
            listView.getItems().add(select.getAbsolutePath());
        }else{
            System.out.println("Error: Invalid File");
        }

    }

    public void abrir(){
        FileReader read = new FileReader();
        String path = (String) listView.getSelectionModel().getSelectedItem();
        //System.out.println(path);
        read.ReadFile(path);
    }
}
