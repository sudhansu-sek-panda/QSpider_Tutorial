public class Demo1 {
   public static void main(String[] args) {
    String a = new String("Ganji");
    System.out.println(a);
    a.concat("Chudel");
    System.out.println(a);
    System.out.println(args);
    // for(int i=0;i<args.length;i++){
    //     System.out.println(args[i]);
    // }
    for(String stringa: args){
        System.out.println(stringa);
    }
   } 
}



