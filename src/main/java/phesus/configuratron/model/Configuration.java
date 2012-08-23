package phesus.configuratron.model;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 03:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Configuration {
    private Integer resolucionAncho;
    private Integer resolucionAlto;
    private Integer idSucursal;
    private Integer idCaja;
    private Integer idTipoCorte;

    private String urlNadesico;
    private String uslMySQL;
    private String userBD;
    private String passBD;

    private Boolean impresoraActiva;
    private String  puertoImpresion;

    private Boolean scannerActivo;
    private Integer scannerPort;
    private Integer scannerBaudRate;

    private Bascula bascula;

    public Integer getResolucionAncho() {
        return resolucionAncho;
    }

    public void setResolucionAncho(Integer resolucionAncho) {
        this.resolucionAncho = resolucionAncho;
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

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getIdTipoCorte() {
        return idTipoCorte;
    }

    public void setIdTipoCorte(Integer idTipoCorte) {
        this.idTipoCorte = idTipoCorte;
    }

    public String getUrlNadesico() {
        return urlNadesico;
    }

    public void setUrlNadesico(String urlNadesico) {
        this.urlNadesico = urlNadesico;
    }

    public String getUslMySQL() {
        return uslMySQL;
    }

    public void setUslMySQL(String uslMySQL) {
        this.uslMySQL = uslMySQL;
    }

    public String getUserBD() {
        return userBD;
    }

    public void setUserBD(String userBD) {
        this.userBD = userBD;
    }

    public String getPassBD() {
        return passBD;
    }

    public void setPassBD(String passBD) {
        this.passBD = passBD;
    }

    public Boolean getImpresoraActiva() {
        return impresoraActiva;
    }

    public void setImpresoraActiva(Boolean impresoraActiva) {
        this.impresoraActiva = impresoraActiva;
    }

    public String getPuertoImpresion() {
        return puertoImpresion;
    }

    public void setPuertoImpresion(String puertoImpresion) {
        this.puertoImpresion = puertoImpresion;
    }

    public Boolean getScannerActivo() {
        return scannerActivo;
    }

    public void setScannerActivo(Boolean scannerActivo) {
        this.scannerActivo = scannerActivo;
    }

    public Integer getScannerPort() {
        return scannerPort;
    }

    public void setScannerPort(Integer scannerPort) {
        this.scannerPort = scannerPort;
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
