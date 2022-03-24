package web.model;

public class Car {
    private String model;
    private String colour;
    private int series;

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSeries() {
        return series;
    }

    public Car (String model, String colour, int series){
        this.model = model;
        this.colour = colour;
        this.series = series;
    }
    public String toString(){
        return  "This is " + model + ", colour is " + colour + ", series is " + series;
    }
}
