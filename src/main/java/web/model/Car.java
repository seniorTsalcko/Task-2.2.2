package web.model;

public class Car {
    private String model;
    private int horsePower;
    private String color;

    public Car() {
    }

    public Car(String model, int horsePower, String color) {
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                '}';
    }
}
