package OOPS;

public class Static {
    public static void main(String[] args) {
        Chaatra s1 = new Chaatra();
        s1.schoolName = "JVM";

        Chaatra s2 = new Chaatra();
        System.out.println(s2.schoolName);

        Chaatra s3 = new Chaatra();
        s3.schoolName = "ABC";
        System.out.println(s1.schoolName);
    }
}

class Chaatra{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name ;
    }
    String getName(){
        return this.name;
    }
}