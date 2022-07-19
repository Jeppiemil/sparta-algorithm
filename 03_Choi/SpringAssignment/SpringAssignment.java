public class SpringAssignment {
    public static void main(String[] args) {

        // 1. Senario begin, Bus Number check, Taxi number, fuel, status check
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Taxi t1 = new Taxi(1004);
        Taxi t2 = new Taxi(4885);

        // 각 Bus 번호 다른지 확인
        System.out.printf("b1 [버스번호:%03d]\n", b1.getNumber());
        System.out.printf("b2 [버스번호:%03d]\n", b2.getNumber());

        System.out.println("=============버스 시나리오 시작=============");
        b1.boarding(2);
        b1.setFuel(-50);
        b1.setStatus("차고지행");
        b1.setFuel(10);
        b1.setStatus("운행중");
        b1.boarding(45);
        b1.boarding(5);
        b1.setFuel(-55);

        System.out.println("==============시나리오 종료===============");

        //생성자에 작성하기
        System.out.printf("t1 [택시번호:%04d, 연료량:%d, 상태:%s]\n", t1.getNumber(), t1.getFuel(), t1.getStatus());
        System.out.printf("t2 [택시번호:%04d, 연료량:%d, 상태:%s]\n", t2.getNumber(), t2.getFuel(), t2.getStatus());

        System.out.println("=============택시 시나리오 시작=============");
        t1.boarding(2, "서울역", 2);
        t1.setFuel(-80);
        t1.pay();
        t1.boarding(5);
        t1.boarding(3, "구로디지털단지역", 12);
        t1.setFuel(-20);
        t1.pay();


    }
}

