package phesus.configuratron.model;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 23/08/12
 * Time: 04:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bascula {
    private Boolean activa;
    private String  puerto;
    private Integer baud;
    private Integer bits;
    private Integer stopBits;
    private String  parity;
    private String  stopChar;
    private String  weightCommand;

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public Integer getBaud() {
        return baud;
    }

    public void setBaud(Integer baud) {
        this.baud = baud;
    }

    public Integer getBits() {
        return bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public Integer getStopBits() {
        return stopBits;
    }

    public void setStopBits(Integer stopBits) {
        this.stopBits = stopBits;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public String getStopChar() {
        return stopChar;
    }

    public void setStopChar(String stopChar) {
        this.stopChar = stopChar;
    }

    public String getWeightCommand() {
        return weightCommand;
    }

    public void setWeightCommand(String weightCommand) {
        this.weightCommand = weightCommand;
    }
}
