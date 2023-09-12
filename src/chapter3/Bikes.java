package chapter3;

public class Bikes {

    private boolean isOn;
    private boolean isOff;
    private int gear;

//    public boolean gear (boolean isOn, int gear) {
//        this.isOn = true;
//
//        this.gear = 16;

    public boolean keyOn() {
        if(!isOn){
            isOn = true;
        } else {
            isOn = false;
        } return isOn;
    }

    public boolean keyOff() {
        if(!isOff){
            isOff = true;
        } else {
            isOff = false;
        } return isOff;
    }

    public boolean accelerated() {
        return true;
    }

    public int gear1() {
        if (keyOn() && gear < 15){
            gear++;
        } else if (gear >= 15){
            System.out.println("bike gear cannot go beyond 4");
        } return 16;
    }

}

