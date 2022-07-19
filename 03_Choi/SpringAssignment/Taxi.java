public class Taxi extends Transfortation{
    private String destination;
    private int distance;
    private int defaultDistance;
    private int payPerDistance;


    {
        data.replace("maxPassangerNumber", 4);
        data.put("seat", data.get("maxPassangerNumber"));
        data.replace("fee", 3000);
        payPerDistance = 1000;
        defaultDistance = 1;
        status = "일반";
    }

    Taxi(){
        super();
        data.put("number", -1);
    }
    Taxi(int number){
        super();
        data.put("number", number);
    }

    //운행시작
    public void drive(){
        if(data.get("fuel") >= 10){
            status = "일반";
        }
        else {
            status = "탑승불가";
            System.out.println("주유필요");
        }
        //주유량 체크, 10 이상 시 운행 가능
    }

    //거리당 요금 추가
    public void addFee(){
        //- 기본 거리보다 먼 곳은 추가 요금이 붙습니다.
        //- 기본 거리와 추가 요금은 자유롭게 산정해 주세요
    }
    //요금 결제
    public void pay(){
        System.out.printf("택시요금결제 [주유량:%d, 누적요금:%d]\n", data.get("fuel"), data.get("feeSum"));
        drive();

        //최종 요금 출력
    }


    //승객탑승
    public void boarding(int n){
        if(data.get("maxPassangerNumber") < n)
            System.out.println("최대 승객 수 초과");

    }

        public void boarding(int n, String des, int dis){
        if(status == "일반"){
            if(data.get("maxPassangerNumber") < n)
                System.out.println("최대 승객 수 초과");
            else{
                data.put("passangers", n);
                data.replace("seat", data.get("maxPassangerNumber") - n);
                destination = des;
                distance = dis;
                data.put("feeSum", data.get("fee") + (distance - defaultDistance) * payPerDistance);
                status = "운행중";
            }
        }
        else{
            System.out.println("탑승불가");
        }


        //택시 상태 "일반"일 때만 승객 탑승 가능 그 외는 "탑승불가"
        //"일반"상태에서 승객 태울 시 "운행 중"으로 상태 변경
    }
    //속도변경
    public void setVelocity(){
        //변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.
    }

    public String getDestination(){
        return destination;
    }
    public int getDistance(){
        return distance;
    }
}