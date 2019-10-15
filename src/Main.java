import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TextFinder.fxml"));
        primaryStage.setTitle("Text Finder");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        FileReader r= new FileReader();
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test.txt");
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test1.txt");
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test2.txt");
        launch(args);
    }

}
