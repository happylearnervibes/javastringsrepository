public class Car {

    String model;
    String color;
    int horsePower; //camelcase standard fileds and methods names follow and class follow pascal case standard

    public void startCar(){ // void method
        System.out.println("Vehicle started");
    }
    public String stopCar(){ // non void method
        String output = "Vehicle stopped";
        return output;
    }
}
