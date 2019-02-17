package cityservices.com.example.PotholeReport.models;


import javax.persistence.*;

@Entity
@Table(name="potholes")
public class Pothole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;


    public Pothole(int diameter, String location, String description) {
        this.diameter = diameter;
        this.location = location;
        this.description = description;
    }


    public Pothole() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
