public class SpringAssignment {
    public static void main(String[] args) {

        // 1. Senario begin, Bus Number check, Taxi number, fuel, status check
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Taxi t1 = new Taxi(1004);
        Taxi t2 = new Taxi(4885);

        // 각 Bus 번호 다른지 확인
        System.out.println("=============버스 번호 확인============");
        System.out.printf("b1 : " + b1);
        System.out.printf("b2 : " + b2);

        System.out.println("=============버스 시나리오 시작=============");
        b1.boarding(2); // 승객 2명 탑승
        b1.setFuel(-50); // 연료감소 -50
        b1.setStatus("차고지행"); // 상태 변화 - 차고지행
        b1.setFuel(10); // 차고지행, 연료 증가 10
        b1.setStatus("운행"); //
        b1.boarding(45);
        b1.boarding(5);
        b1.setFuel(-55);

        System.out.println("==============버스 시나리오 종료===============\n");


        System.out.println("=============택시 상태 확인============");
        System.out.printf("t1 : " + t1);
        System.out.printf("t2 : " + t2);

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

