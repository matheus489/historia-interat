import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class teste extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Interface1.fxml"));
         Parent root = fxmlLoader.load();
         Scene tela = new Scene(root);

         primaryStage.setTitle("Livro interativo");
         primaryStage.setScene(tela);
         primaryStage.show();
    }}