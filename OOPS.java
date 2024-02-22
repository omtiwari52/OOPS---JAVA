package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(7);
        System.out.println(p1.tip);
        p1.setColor("Grey");
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Om Tiwari" ;
        myAcc.setPassword("seekhgyena");
        System.out.println(myAcc.Username);
    }
}
class Pen{
    String color;
    int tip ;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class BankAccount{
    public String Username ;
    private String Password ;
    public void setPassword(String pwd){
        Password = pwd;
    }
}

// class Pen{
//     private String color;
//     private int tip ;

//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         this.color = newColor;
//     }
//     void setTip(int tip){
//         this.tip = tip;
//     }
// }