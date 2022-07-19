public class Bus extends Transfortation {
    private static int busNumber = 0;

    Bus() {
        super();
        data.replace("number", busNumber);
        data.replace("maxPassangerNumber", 30);
        data.replace("fee", 1000);
        data.put("feeSum", 0);
        data.put("currPassangers", 0);
        status = "운행중";
        busNumber++;

        // 운행 종료 및 주유량이 0이 될 시 "차고지행"
        //주유량이 10 미만일 경우 "주유가 필요하다" 메시지 출력
    }

    public void drive() {

    }



    //승객 탑승
    public void boarding(int n) {
        System.out.printf("승객 %d명 탑승 시도 ", n);
        if ((data.get("maxPassangerNumber") >= data.get("currPassangers") + n) && status == "운행중") {{
            data.replace("currPassangers", data.get("currPassangers") + n);
            data.replace("feeSum", data.get("feeSum") + n * data.get("fee"));
            System.out.println(n + "명 탑승");
        }
        } else {
            System.out.println("‘최대 승객 수 초과’");
        }
        //최대 승객수 이하 및 운행중 상태에서만 가능
        //탑승 시 현재 승객 수 증가
    }

    //속도 변경
    public void setVelocity() {
        //주유상태 체크 - 주유량 10 미만 시 차고지행
        //경고 메시지 : "주유량을 확인해주세요"를 print로 출력
        //변경하는 속도를 입력받아 현재 속도에 추가 및 빼기
    }

    @Override
    public void addFuel(int n){
        System.out.println("버스 주유량 변화 : " + n);
        data.replace("fuel", data.get("fuel") + n);
        if(data.get("fuel") < 10){
            System.out.println("주유 필요");
        }
        if(data.get("fuel") < 10){
            this.setStatus("차고지행");
        }
    }

    @Override
    public void setStatus(String status) {
        if(status == "차고지행")
        {
            data.replace("maxPassangerNumber", 30);
            data.replace("currPassangers", 0);
            data.replace("feeSum", 0);

        }

        this.status = status;
    }
}