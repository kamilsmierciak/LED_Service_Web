package pl.ies.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String serial;

    private String type;

    @Temporal(TemporalType.DATE)
    private Date addDate;

    private boolean isRegistered;

    private boolean isActive;

    @OneToOne
    private HardwareDetails hardwareDetails;

}
