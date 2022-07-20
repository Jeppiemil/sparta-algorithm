public class Taxi extends Transfortation {
    private String destination;
    private int distance;
    private int defaultDistance;
    private int payPerDistance;


    {
        passangers = 0;
        maxPassangerNumber = 4;
        seat = maxPassangerNumber;
        fuel = 100;
        fee = 3000;
        feeSum = 0;
        velocity = 0;
        payPerDistance = 1000;
        defaultDistance = 1;
        status = "일반";
    }

    Taxi(int number) {
        super();
        this.number = number; //택시 번호
    }

    //운행시작
    public void drive(int vel, int fuel) {
        setVelocity(vel);
        setFuel(fuel);

        if (fuel <= 0) {
            setStatus("운행불가");
        } else if (fuel < 10) {
            setStatus("운행불가");
            System.out.println("주유필요");
        } else {
            setStatus("일반");
        }
        //주유량 체크, 10 이상 시 운행 가능
    }

    public void drive() {
        if (fuel >= 10) {
            status = "일반";
            System.out.println("운행가능");
        } else if (fuel > 0) {
            status = "탑승불가";
            System.out.println("주유필요");
        } else
            System.out.println("운행불가");
        //주유량 체크, 10 이상 시 운행 가능
    }

    public void boarding(int n) {
        if (maxPassangerNumber < n)
            System.out.println("최대 승객 수 초과");

    }

    public void boarding(int n, String des, int dis) {
        if (status == "일반") {
            if (seat >= n) {
                passangers = n;
                seat = maxPassangerNumber - passangers;
                destination = des;
                distance = dis;
                feeSum = fee + (distance - defaultDistance) * payPerDistance;
                status = "운행중";

                System.out.printf("taxi [탑승승객수:%d, 잔여승객수:%d, 기본요금확인:%d, 목적지:%s, 목적지까지거리:%dkm, 지불할요금:%d, 상태:%s]" +
                        "\n", passangers, seat, fee, destination, distance, feeSum, status);
            } else
                System.out.println("최대 승객 수 초과");
        } else {
            System.out.println("탑승불가");
        }


        //택시 상태 "일반"일 때만 승객 탑승 가능 그 외는 "탑승불가"
        //"일반"상태에서 승객 태울 시 "운행 중"으로 상태 변경
    }


    //요금 결제
    public void pay() {
        System.out.printf("택시요금결제 [주유량:%d, 누적요금:%d]\n", fuel, feeSum);
        passangers = 0;
        seat = maxPassangerNumber;
        destination = "";
        distance = 0;
        feeSum = 0;
        status = "일반";
        //최종 요금 출력
    }


    //거리당 요금 추가
    public int extraFee(int distance) {
        if (distance > defaultDistance) {
            return 1000;
        } else return 0;
    }




    @Override
    public void setFuel(int n) {
        System.out.println("택시 주유량 변화 : " + n);
        fuel += n;
        if(fuel < 10){
            setStatus("운행불가");
            System.out.println("주유가 필요합니다.");
        }
        System.out.printf("taxi [상태:%s, 주유량:%d]\n", status, fuel);

    }

    @Override
    public String toString(){
        return String.format("[택시번호:%04d, 연료량:%d, 상태:%s]\n", getNumber(), getFuel(), getStatus());
    }
}