package pl.ies.entity;

import pl.ies.model.Color;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modeldetails")
public class HardwareDetails {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String serial;

    private Integer red;
    private Integer green;
    private Integer blue;



    public HardwareDetails(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public HardwareDetails(String serial, Integer red, Integer green, Integer blue) {
        this.serial = serial;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
