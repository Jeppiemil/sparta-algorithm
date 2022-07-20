public class Bus extends Transfortation {
    private static int busNumber = 0;


    Bus() {
        super();
        number = busNumber;
        passangers = 0;
        maxPassangerNumber = 30;
        seat = maxPassangerNumber;
        fuel = 100;
        fee = 1000;
        feeSum = 0;
        velocity = 0;
        status = "운행"; // "운행" 혹은 "차고지행"
        busNumber++;

        // 운행 종료 및 주유량이 0이 될 시 "차고지행"
        //주유량이 10 미만일 경우 "주유가 필요하다" 메시지 출력
    }

    public void drive(int vel, int fuel) {

        // 속도와 연료의 모든 동작은 drive 메소드를 통해 이루어집니다.
        // setVelocity와 setFuel의 결과는 drive를 통해 처리됩니다.
//        if (this.fuel + fuel <= 0)
//            setStatus("차고지행");
//        else if (this.fuel + fuel < 10){
//            System.out.println("주유가 필요합니다.");
//            setStatus("차고지행");
//        }
//        else
//            setStatus("운행");

        setVelocity(vel);
        setFuel(fuel);
    }

    @Override
    public void setFuel(int n) {
        System.out.println("버스 주유량 변화 : " + n);
        fuel += n;
        if(fuel <= 0){
            setStatus("차고지행");
        }
        else if(fuel < 10){
            setStatus("차고지행");
            System.out.println("주유가 필요합니다.");
        }
        System.out.printf("bus [상태:%s, 주유량:%d]\n", status, fuel);

    }

    //승객 탑승
    public void boarding(int n) {
        System.out.printf("승객 %d명 탑승시도 ", n);
        if ((seat >= passangers + n)) {
            if (status == "운행" || status == "운행중") {
                //운행중인 경우
                passangers += n;
                feeSum += n * fee;
                seat = maxPassangerNumber - passangers;
                System.out.println(n + "명 탑승");
                System.out.println(String.format("b1 [탑승 승객 수:%d, 잔여 승객 수:%d, 요금 확인:%d]", passangers, seat, feeSum));
            } else {
                //차고지에 있을 경우
                System.out.printf("\n현재 상태는 %s 입니다.\n", this.status);
            }
        } else {
            // 승객 수가 자리보다 많을 경우
            System.out.println("최대 승객 수 초과");
        }
    }

    @Override
    public void setStatus(String status) {

        this.status = status;

        // 차고지 행인 경우 승객 수 및 요금 초기화
        if (this.status == "차고지행") {
            //차고지로 복귀, 승객 숫자 및 요금 초기화
            seat = 30;
            passangers = 0;
            feeSum = 0;
        }
    }

    @Override
    public String toString(){
        return String.format("[버스번호:%03d, 연료량:%d, 상태:%s]\n", getNumber(), getFuel(), getStatus());
    }

}