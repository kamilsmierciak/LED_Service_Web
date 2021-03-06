package pl.ies.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "Group")
public class HardwareUsageGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    private String description;

    //Constructors

    public HardwareUsageGroup(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public HardwareUsageGroup(String name) {
        this.name = name;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
