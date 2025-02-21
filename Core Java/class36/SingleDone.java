
public class SingleDone {
    static SingleDone t = new SingleDone();
    private SingleDone(){
        
    }
    public static SingleDone getData(){
        return t;
    }
    public static SingleDone getData1(){
        return t;
    }
    public static SingleDone getData2(){
        return t;
    }
    public static void main(String a[]){
        SingleDone s1 = SingleDone.getData();
        SingleDone s2 = SingleDone.getData1();
        SingleDone s3 = SingleDone.getData2();
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s2 == s3); // true

    }
}
