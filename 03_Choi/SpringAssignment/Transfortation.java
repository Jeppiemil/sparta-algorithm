import java.util.HashMap;

abstract class Transfortation {

    protected HashMap<String, Integer> data = new HashMap<>();

    // hash map vs private primitive
    //    int number;
    //    int fuel;
    //    int velocity;
    //    int velDelta;
    //    int maxPassangerNumber;
    //    int fee;

    protected String status;

    Transfortation() {
        //data hashmap의 값이 저장되지 않은 경우, -1 값으로 초기화
        data.put("number", -1);
        data.put("fuel", 100);
        data.put("velocity", 0);
        data.put("maxPassangerNumber", -1);
        data.put("fee", -1);
        status = "";
    }

    abstract public void drive();

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVelocity(int vel) {

    }

    public void boarding(int num) {

    }

    public int getData(String key) {
        return data.get(key);
    }

    public String getStatus() {
        return status;
    }

    public void addFuel(int n){
        data.replace("fuel", data.get("fuel") + n);
    }
}