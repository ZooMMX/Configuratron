package phesus.configuratron;

 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Scene;
 import javafx.scene.layout.AnchorPane;
 import javafx.scene.layout.StackPane;
 import javafx.stage.Stage;

 public class ConfiguratorApp extends Application {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Application.launch(ConfiguratorApp.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane page = (AnchorPane) FXMLLoader.load(ConfiguratorApp.class.getResource("configurator.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Configuratron");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(ConfiguratorApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}