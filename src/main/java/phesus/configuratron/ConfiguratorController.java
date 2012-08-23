package phesus.configuratron;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 02:01 PM
 * To change this template use File | Settings | File Templates.
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;


public class ConfiguratorController
        implements Initializable {

    @FXML //  fx:id="x3"
    private TitledPane x3; // Value injected by FXMLLoader


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert x3 != null : "fx:id=\"x3\" was not injected: check your FXML file 'configurator.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected

    }

}

