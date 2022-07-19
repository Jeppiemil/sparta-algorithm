import java.util.HashMap;

abstract class Transfortation {

    protected int number;
    protected int fuel;
    protected int velocity;
    protected int velDelta;
    protected int maxPassangerNumber;
    protected int passangers;
    protected int fee;
    protected String status;


    abstract public void drive();

    abstract void boarding(int num);

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVelocity(int vel) {
        velocity = vel;
    }


    public int getFuel() {
        return fuel;
    }

    public String getStatus() {
        return status;
    }

    public void setFuel(int n) {
        fuel += n;
    }

    public int getNumber(){
        return number;
    }
}