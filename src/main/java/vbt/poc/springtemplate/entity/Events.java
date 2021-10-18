package vbt.poc.springtemplate.entity;


import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "events")
@Data
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "leader")
    private Leaders leader;
}
