import java.util.HashMap;

abstract class Transfortation {

    protected int number;
    protected int fuel;
    protected int velocity;
    protected int velDelta;
    protected int maxPassangerNumber;
    protected int passangers;
    protected int fee;
    protected int feeSum;
    protected  int seat;
    protected String status;


    abstract public void drive(int vel, int fuel);

    abstract void boarding(int num);

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVelocity(int vel) {
        velocity += vel;
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