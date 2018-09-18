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

    private Color color;

    public HardwareDetails(String serial, Color color) {
        this.serial = serial;
        this.color = color;
    }

    public HardwareDetails(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
