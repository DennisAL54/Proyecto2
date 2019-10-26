import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TextFinder.fxml"));
        primaryStage.setTitle("Text Finder");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    public static void main(String[] args) throws FileNotFoundException {
       //File[] Arr;
       //ArbolB tree = new ArbolB();
       File file = new File("C:\\Users\\aleji\\Desktop\\ALE\\Documentos TEC\\Semestre 6\\Datos\\Proyecto Text Finder\\Proyecto2\\Files");
       //Arr = file.listFiles();
       //for(File f:Arr){
       //tree.scan(f);
       //}

        launch(args);
    }

}
