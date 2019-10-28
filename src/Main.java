import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * Clase main encargada de iniciar la aplicacion
 */

public class Main extends Application{
    /***
     * Metodo start, inicializa la ventana principal de la aplicacion
     * @param
     * @return
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TextFinder.fxml"));
        primaryStage.setTitle("Text Finder");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }

    /***
     * Metodo main, se esncarga de inicar el programa
     * @param args
     * @return
     */
    public static void main(String[] args){
        launch(args);
    }

}
