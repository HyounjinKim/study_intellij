package org.example.myclass;

class MobilePhone {
    protected String number;

//    public MobilePhone(){}
    public MobilePhone(String number){
        this.number = number;
    }
    public void answer(){
        System.out.println("번호" + number);
    }
}

class SmartPhone extends MobilePhone{

    private String androidVer;

    public SmartPhone(String number,String ver) {
        super(number);
        this.androidVer = ver;
    }
    public void playApp(){
        System.out.println("안드로이드 버전 = " + androidVer);
    }
}

public class Main2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("010-9999-9999","1.0");
        sp.playApp();
        sp.answer();

        //부모객체      //자식객체
        //자식객체는 부모객체에 담을 수 있다
        //부모객체는 자식객체를 참조할 수 있다
        //다형성이라고 한다
        MobilePhone mp = new SmartPhone("010-1111-1111","2.0");
        mp.answer();
//        mp.playApp();
    }
}
