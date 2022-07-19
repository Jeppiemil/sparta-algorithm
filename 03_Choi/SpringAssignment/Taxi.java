public class Taxi extends Transfortation {
    private String destination;
    private int distance;
    private int defaultDistance;
    private int payPerDistance;
    private int seat;
    private int feeSum;


    {
        passangers = 0;
        maxPassangerNumber = 4;
        seat = maxPassangerNumber;
        fee = 3000;
        feeSum = 0;
        payPerDistance = 1000;
        defaultDistance = 1;
        status = "일반";
    }

    Taxi() {
        super();
    }

    Taxi(int number) {
        super();
        this.number = number;
    }

    //운행시작
    public void drive() {
        if (fuel >= 10) {
            status = "일반";
        } else {
            status = "탑승불가";
            System.out.println("주유필요");
        }
        //주유량 체크, 10 이상 시 운행 가능
    }

    //거리당 요금 추가
    public void addFee() {
        //- 기본 거리보다 먼 곳은 추가 요금이 붙습니다.
        //- 기본 거리와 추가 요금은 자유롭게 산정해 주세요
    }

    //요금 결제
    public void pay() {
        System.out.printf("택시요금결제 [주유량:%d, 누적요금:%d]\n", fuel, feeSum);
        drive();

        //최종 요금 출력
    }


    //승객탑승
    public void boarding(int n) {
        if (maxPassangerNumber < n)
            System.out.println("최대 승객 수 초과");

    }

    public void boarding(int n, String des, int dis) {
        if (status == "일반") {
            if (maxPassangerNumber < n)
                System.out.println("최대 승객 수 초과");
            else {
                passangers = n;
                seat = maxPassangerNumber - passangers;
                destination = des;
                distance = dis;
                feeSum = fee + (distance - defaultDistance) * payPerDistance;
                status = "운행중";

                System.out.printf("t1 [탑승승객수:%d, 잔여승객수:%d, 기본요금확인:%d, 목적지:%s, 목적지까지거리:%dkm, 지불할요금:%d, 상태:%s]" +
                                "\n", passangers, seat, fee, destination, distance, feeSum, status);

            }
        } else {
            System.out.println("탑승불가");
        }


        //택시 상태 "일반"일 때만 승객 탑승 가능 그 외는 "탑승불가"
        //"일반"상태에서 승객 태울 시 "운행 중"으로 상태 변경
    }

    //속도변경
    public void setVelocity() {
        //변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}