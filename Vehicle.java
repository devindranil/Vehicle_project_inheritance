public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    //constructor
    public Vehicle(String name){
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    //stear
    public void stear(int direction)
    {
        this.currentDirection = direction;
        System.out.println("Stear method called. Stearing at " + currentDirection + " degrees");
    }

    //move
    public void move(int speed, int direction)
    {
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("Move method called: Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    /*getter and setter for all the above private variables */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    //method to mention the stop of the vehicle
    //if speed value = 0 then it's means car is stop
    public void stop(){
        this.currentSpeed=0;
        System.out.println("Vehicle is stopped");
    }
}
