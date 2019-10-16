import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

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
        ArbolB tree = new ArbolB();//inicio de prueba de parseo
        String word = JOptionPane.showInputDialog("insertar palabra");
        char[] cArray = word.toCharArray();
        char character = cArray[0];
        int ascii = (int)character;
        tree.add(ascii, word);//fin de prueba de parseo
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test.txt");
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test1.txt");
        r.ReadFile("C:\\Users\\Dell\\Desktop\\Test2.txt");
        launch(args);
    }

}
