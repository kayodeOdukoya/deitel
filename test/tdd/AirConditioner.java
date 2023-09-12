package tdd;

public class AirConditioner {

    private boolean isOn;
    private int temperature;


    public AirConditioner (boolean isOn, int temperature) {
        this.isOn = false;

        this.temperature = 16;
    }
    public boolean turnOn() {
        return isOn;
    }

    public void toggleOn() {
        if(!isOn){
            isOn = true;
        } else {
            isOn = false;
        }
        
    }

    public int increaseTemperature() {
        if (turnOn() && temperature < 30) {
            temperature++;
        } else if (temperature >=30) {
            System.out.println("temperature cannot go beyond 30");
        } return temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public int decreaseTemperature() {
        if(turnOn())
                if(temperature > 16 && temperature < 30){
            temperature--;
        } else if(temperature == 16 ) {
                   System.out.println("temperature cannot go lower than 16");
                } return temperature;
    }
}
