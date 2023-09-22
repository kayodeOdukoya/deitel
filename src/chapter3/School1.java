package chapter3;

public class School1 {

    private int numberOfStudent;
    private String location;
    private String schoolName;

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setNumberOfStudent(int numberOfStudent){
        this.numberOfStudent = numberOfStudent;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public String getLocation(){
        return location;
    }

    public int getNumberOfStudent(){
        return numberOfStudent;
    }
}


