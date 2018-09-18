package pl.ies.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    private int id;

    private String name;

    @OneToMany
    private List<Hardware> hardwareList = new ArrayList<>();
}
