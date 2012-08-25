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
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
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

    @FXML private ToggleButton impresoraActiva;

    @FXML private ToggleButton impresoraInactiva;

    @FXML private TextField puertoImpresora;

    @FXML private ToggleButton scannerActivo;

    @FXML private ToggleButton scannerInactivo;

    @FXML private TextField puertoScanner;

    @FXML private ToggleButton basculaActiva;

    @FXML private ToggleButton basculaInactiva;

    @FXML private TextField portScale;

    @FXML private TextField baudScale;

    @FXML private TextField bitsScale;

    @FXML private TextField stopBitScale;

    @FXML private TextField parityScale;

    @FXML private TextField stopCharScale;

    @FXML private TextField weightCommandScale;

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
        assert impresoraActiva != null : "fx:id=\"impresoraActiva\" was not injected: check your FXML file 'configurator.fxml'.";

        urlServidor.textProperty().bindBidirectional(config.getUrlNadesico());
        urlBD.textProperty().bindBidirectional(config.getUrlMySQL());
        userBD.textProperty().bindBidirectional(config.getUserBD());
        passBD.textProperty().bindBidirectional(config.getPassBD());

        // ---- Impresora
        PersistentButtonToggleGroup tgImpresora = new PersistentButtonToggleGroup();
        impresoraInactiva.setToggleGroup(tgImpresora);
        impresoraActiva.setToggleGroup(tgImpresora);
        impresoraActiva.selectedProperty().bindBidirectional(config.getImpresoraActiva());

        puertoImpresora.textProperty().bindBidirectional(config.getPuertoImpresion());

        // ---- Scanner

        PersistentButtonToggleGroup tgScanner = new PersistentButtonToggleGroup();
        scannerInactivo.setToggleGroup(tgScanner);
        scannerActivo.setToggleGroup(tgScanner);
        scannerActivo.selectedProperty().bindBidirectional(config.getScannerActivo());

        puertoScanner.textProperty().bindBidirectional(config.getScannerPort());

        // ---- Báscula

        PersistentButtonToggleGroup tgBascula = new PersistentButtonToggleGroup();
        basculaInactiva.setToggleGroup(tgBascula);
        basculaActiva.setToggleGroup(tgBascula);
        basculaActiva.selectedProperty().bindBidirectional(config.getBascula().getActiva());

        portScale.textProperty().bindBidirectional(config.getBascula().getPort());
        parityScale.textProperty().bindBidirectional(config.getBascula().getParity());
        stopCharScale.textProperty().bindBidirectional(config.getBascula().getStopChar());
        weightCommandScale.textProperty().bindBidirectional(config.getBascula().getWeightCommand());
    }

}

