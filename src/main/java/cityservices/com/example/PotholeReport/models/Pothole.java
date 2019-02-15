package cityservices.com.example.PotholeReport.models;


import javax.persistence.*;

@Entity
@Table(name = "potholes")
public class Pothole {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "location")
    private String lcoation;

    @Column(name = "image")
    private String image;

    public Pothole(int diameter, String lcoation, String image) {
        this.diameter = diameter;
        this.lcoation = lcoation;
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

    public String getLcoation() {
        return lcoation;
    }

    public void setLcoation(String lcoation) {
        this.lcoation = lcoation;
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
