package cityservices.com.example.PotholeReport.models;


import javax.persistence.*;

@Entity
@Table(name="potholes")
public class Pothole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "location")
    private String location;

    @Column(name = "image")
    private String image;

    public Pothole(int diameter, String location, String image) {
        this.diameter = diameter;
        this.location = location;
        this.image = image;
    }

    public Pothole() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
