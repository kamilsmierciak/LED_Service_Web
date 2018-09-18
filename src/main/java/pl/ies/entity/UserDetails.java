package pl.ies.entity;

import javax.persistence.*;

@Entity
@Table
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
