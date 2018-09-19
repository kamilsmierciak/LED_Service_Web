package pl.ies.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="hardware", uniqueConstraints ={@UniqueConstraint(columnNames = {"serial"})})
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "serial")
    @NotBlank
    private String serial;

    private String type;

    @Temporal(TemporalType.DATE)
    private Date addDate;

    private boolean isRegistered;

    private boolean isActive;

    @OneToOne
    private HardwareDetails hardwareDetails;



    //Constructor


    public Hardware() {
    }

    public Hardware(String serial, String type, Date addDate, boolean isRegistered, boolean isActive, HardwareDetails hardwareDetails) {
        this.serial = serial;
        this.type = type;
        this.addDate = addDate;
        this.isRegistered = isRegistered;
        this.isActive = isActive;
        this.hardwareDetails = hardwareDetails;
    }

    public Hardware(String serial, String type, Date addDate, boolean isRegistered, boolean isActive) {
        this.serial = serial;
        this.type = type;
        this.addDate = addDate;
        this.isRegistered = isRegistered;
        this.isActive = isActive;
    }
    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public HardwareDetails getHardwareDetails() {
        return hardwareDetails;
    }

    public void setHardwareDetails(HardwareDetails hardwareDetails) {
        this.hardwareDetails = hardwareDetails;
    }
}
