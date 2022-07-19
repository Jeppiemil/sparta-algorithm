public class SpringAssignment {
    public static void main(String[] args) {

        // 1. Senario begin, Bus Number check, Taxi number, fuel, status check
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Taxi t1 = new Taxi(1004);
        Taxi t2 = new Taxi(4885);

        // 각 Bus 번호 다른지 확인
        System.out.printf("b1 [버스번호:%03d]\n", b1.getData("number"));
        System.out.printf("b2 [버스번호:%03d]\n", b2.getData("number"));

        System.out.println("=============버스 시나리오 시작=============");
        b1.boarding(2);
        System.out.printf("b1 [탑승 승객 수:%d, 잔여 승객 수:%d,요금 확인:%d]\n", b1.getData("currPassangers"), b1.data.get("maxPassangerNumber") - b1.data.get("currPassangers"), b1.data.get("feeSum"));
        b1.addFuel(-50);
        System.out.printf("b1 [주유량:%d]\n", b1.getData("fuel"));
        b1.setStatus("차고지행");
        b1.addFuel(10);;
        System.out.printf("b1 [상태:%s, 주유량:%d]\n", b1.status, b1.getData("fuel"));
        b1.setStatus("운행중");
        b1.boarding(45);
        b1.boarding(5);
        System.out.printf("b1 [탑승 승객 수:%d, 잔여 승객 수:%d,요금 확인:%d]\n", b1.getData("currPassangers"), b1.data.get("maxPassangerNumber") - b1.data.get("currPassangers"), b1.data.get("feeSum"));
        b1.addFuel(-55);
        System.out.printf("b1 [주유량:%d, 상태:%s]\n", b1.getData("fuel"), b1.getStatus());

        System.out.println("==============시나리오 종료===============");

        System.out.printf("t1 [택시번호:%04d, 연료량:%d, 상태:%s]\n", t1.getData("number"), t1.getData("fuel"), t1.getStatus());
        System.out.printf("t2 [택시번호:%04d, 연료량:%d, 상태:%s]\n", t2.getData("number"), t2.getData("fuel"), t2.getStatus());

        System.out.println("=============택시 시나리오 시작=============");
        t1.boarding(2, "서울역", 2);
        System.out.printf("t1 [탑승승객수:%d, 잔여승객수:%d, 기본요금확인:%d, 목적지:%s, 목적지까지거리:%dkm, 지불할요금:%d, 상태:%s]" +
                "\n", t1.getData("passangers"), t1.getData("seat"), t1.getData("fee"), t1.getDestination(),
                t1.getDistance(), t1.getData("feeSum"), t1.getStatus());
        t1.addFuel(-80);
        t1.pay();
        t1.boarding(5);
        t1.boarding(3, "구로디지털단지역", 12);
        System.out.printf("t1 [탑승승객수:%d, 잔여승객수:%d, 기본요금확인:%d, 목적지:%s, 목적지까지거리:%dkm, 지불할요금:%d, 상태:%s]" +
                        "\n", t1.getData("passangers"), t1.getData("seat"), t1.getData("fee"), t1.getDestination(),
                t1.getDistance(), t1.getData("feeSum"), t1.getStatus());
        t1.addFuel(-20);
        t1.pay();


    }
}

