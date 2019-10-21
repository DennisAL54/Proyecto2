import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

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
       //File file = new File("");
       //Arr = file.listFiles();
       //for(File f:Arr){
       //tree.scan(f);
       //}

        launch(args);
    }

}
