package pl.ies.entity;

import pl.ies.model.Color;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modeldetails")
public class HardwareDetails {

    @Id
    private String serial;

    private Color color;
}
