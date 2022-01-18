package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;

   public Car(){}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public long getId() {
        return id;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    @Override
    public String toString() {
        return "Car model: " + getModel() + "; Car series: " + getSeries();
    }
}
