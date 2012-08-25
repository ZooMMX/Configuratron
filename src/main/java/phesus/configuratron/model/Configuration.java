package phesus.configuratron.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 03:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Configuration {
    private IntegerProperty resolucionAncho;
    private Integer resolucionAlto;
    private Integer idSucursal;
    private Integer idCaja;
    private Integer tipoCorte;

    private StringProperty urlNadesico;
    private StringProperty urlMySQL;
    private StringProperty userBD;
    private StringProperty passBD;

    private Boolean impresoraActiva;
    private StringProperty  puertoImpresion;

    private Boolean scannerActivo;
    private StringProperty  scannerPort;
    private Integer scannerBaudRate;

    private Bascula bascula;

    public IntegerProperty getResolucionAncho() {
        return resolucionAncho;
    }

    public void setResolucionAncho(Integer resolucionAncho) {
        IntegerProperty res = new SimpleIntegerProperty();
        res.set(resolucionAncho);
        this.resolucionAncho = res;
    }

    public Integer getResolucionAlto() {
        return resolucionAlto;
    }

    public void setResolucionAlto(Integer resolucionAlto) {
        this.resolucionAlto = resolucionAlto;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdAlmacen(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(Integer tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public StringProperty getUrlNadesico() {
        return urlNadesico;
    }

    public void setUrlNadesico(String urlNadesico) {
        StringProperty url = new SimpleStringProperty();
        url.setValue(urlNadesico);
        this.urlNadesico = url;
    }

    public StringProperty getUrlMySQL() {
        return urlMySQL;
    }

    public void setUrlMySQL(String urlMySQL) {
        StringProperty url = new SimpleStringProperty();
        url.setValue(urlMySQL);
        this.urlMySQL = url;
    }

    public StringProperty getUserBD() {
        return userBD;
    }

    public void setUserBD(String userBD) {
        StringProperty user = new SimpleStringProperty();
        user.setValue(userBD);
        this.userBD = user;
    }

    public StringProperty getPassBD() {
        return passBD;
    }

    public void setPassBD(String passBD) {
        StringProperty pass = new SimpleStringProperty();
        pass.setValue(passBD);
        this.passBD = pass;
    }

    public Boolean getImpresoraActiva() {
        return impresoraActiva;
    }

    public void setImpresoraActiva(Boolean impresoraActiva) {
        this.impresoraActiva = impresoraActiva;
    }

    public StringProperty getPuertoImpresion() {
        return puertoImpresion;
    }

    public void setPuertoImpresion(String puertoImpresion) {
        StringProperty puerto = new SimpleStringProperty();
        puerto.setValue(puertoImpresion);
        this.puertoImpresion = puerto;
    }

    public Boolean getScannerActivo() {
        return scannerActivo;
    }

    public void setScannerActivo(Boolean scannerActivo) {
        this.scannerActivo = scannerActivo;
    }

    public StringProperty getScannerPort() {
        return scannerPort;
    }

    public void setScannerPort(String scannerPort) {
        StringProperty port = new SimpleStringProperty();
        port.setValue(scannerPort);
        this.scannerPort = port;
    }

    public Integer getScannerBaudRate() {
        return scannerBaudRate;
    }

    public void setScannerBaudRate(Integer scannerBaudRate) {
        this.scannerBaudRate = scannerBaudRate;
    }

    public Bascula getBascula() {
        return bascula;
    }

    public void setBascula(Bascula bascula) {
        this.bascula = bascula;
    }
}
