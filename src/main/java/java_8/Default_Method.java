package java_8;



interface  Sim{
    public abstract void call();
    public abstract  void sms();
    public  default void videocall(){ }
}

class  Airtel implements  Sim{
    public void call(){
        System.out.println("calling using Airtel");
    }
    public void sms(){
        System.out.println("sms sending using Airtels");
    }
}
class  VodaIdea implements  Sim{
    public void call(){
        System.out.println("calling using Airtel");
    }
    public void sms(){
        System.out.println("sms sending ");
    }
}
class  Mobile{
    void  insertSIM( Sim sim){
        sim.call();
        sim.sms();
        sim.videocall();
    }
}
public class Default_Method {
    public static void main(String[] args) {
        Mobile iphone = new Mobile();
        iphone.insertSIM(new Airtel());
    }
}
