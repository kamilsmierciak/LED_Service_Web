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
}
