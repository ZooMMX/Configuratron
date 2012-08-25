package phesus.configuratron;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 02:01 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import org.xml.sax.SAXException;
import phesus.configuratron.model.Configuration;
import phesus.configuratron.model.ConfigurationDao;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;


public class ConfiguratorController
        implements Initializable {
    private ConfigurationDao dao;
    private Configuration config;

    @FXML
    private TitledPane x3;

    @FXML
    private TextField resolucionAncho;

    @FXML
    private TextField urlServidor;

    @FXML
    private TextField urlBD;

    @FXML
    private TextField userBD;

    @FXML
    private TextField passBD;

    @FXML private TextField puertoImpresora;

    @FXML private TextField puertoScanner;

    public ConfiguratorController() {

        dao = new ConfigurationDao();
        try {
            config = dao.read();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (XPathExpressionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert x3 != null : "fx:id=\"x3\" was not injected: check your FXML file 'configurator.fxml'.";

        urlServidor.textProperty().bindBidirectional(config.getUrlNadesico());
        urlBD.textProperty().bindBidirectional(config.getUrlMySQL());
        userBD.textProperty().bindBidirectional(config.getUserBD());
        passBD.textProperty().bindBidirectional(config.getPassBD());

        puertoImpresora.textProperty().bindBidirectional(config.getPuertoImpresion());
        puertoScanner.textProperty().bindBidirectional(config.getScannerPort());
    }

}

