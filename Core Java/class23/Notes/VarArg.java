


public class VarArg {
    /** 
    public void m1(int... x){
System.out.println("var-arg");
    }
    public static void main(String a[]){
        System.out.println();
        VarArg vg1 = new VarArg();
        vg1.m1();
        vg1.m1(10,20,30,40,50);
        **/
    /*}
    public void m1(int.. x){ // Ce
        System.out.println("var-arg");
            }
            public static void main(String a[]){
                System.out.println();
                VarArg vg1 = new VarArg();
                vg1.m1();
                vg1.m1(10,20,30,40,50);
                }
            }**/
                /*
    public void m1(int.... x){ // Ce
        System.out.println("var-arg");
            }
            public static void main(String a[]){
                System.out.println();
                VarArg vg1 = new VarArg();
                vg1.m1();
                vg1.m1(10,20,30,40,50);
                
            }**/
            // public void m1(int... x){
            //     System.out.println(x);
            //     System.out.println(x[0]);
            //     System.out.println(x[1]);
            //     System.out.println(x[2]);

            //         }
                    /* 
                    public void m1(VarArg... y){
                        System.out.println(y);
                        System.out.println(y[0]);
                        System.out.println(y[1]);
                       
        
                            }
                    public static void main(String a[]){
                        System.out.println();
                        VarArg vg1 = new VarArg();
                        // vg1.m1();
                        vg1.m1(10,20,30,40,50,23,45,67,89,0,2,3,4,5,6,7,8,9);
                        vg1.m1(new VarArg(), new VarArg());
                        System.out.println();
                        System.out.println(a);
                        System.out.println(a[0]);
                        System.out.println(a[1]);
                        // vg1.main();


                */
                
                public void m1(int... y){
                    System.out.println(y);
                    for(int i=0;i<y.length;i++){
                    System.out.println(y[i]);
                    
                    }
                   
    
                        }
                public static void main(String a[]){
                    System.out.println();
                    VarArg vg1 = new VarArg();
                    
                    vg1.m1(10,20,30,40,50,23,45,67,89,0,2,3,4,5,6,7,8,9);   
                    }
                    
}
