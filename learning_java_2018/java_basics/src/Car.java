import java.awt.*;

public class Car {
    double average_miles_per_gallon;
    String license_plate;
    Color paintColor;
    boolean are_tailing_working;
    
    //Constructor with default initializing inputs
    public Car(double input_average_MPG,
               String input_license_plate,
               Color input_paint_color,
               boolean input_are_taillights_working){
        this.average_miles_per_gallon = input_average_MPG;
        this.license_plate = input_license_plate;
        this.paintColor = input_paint_color;
        this.are_tailing_working = input_are_taillights_working;
    }
    
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }
    
    public double speedingup(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}
