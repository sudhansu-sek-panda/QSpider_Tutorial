import java.util.Arrays;
class Array{
    public static void main(String []args){

        Array a1 = new Array();
//        a1.ArrayExamp();
        a1.ArrayExamp2();
        }


        public void ArrayExamp(){
            int arr1[] = {1,2,3,4,5};
            System.out.println(arr1);
            for(int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
            }
            int arr2[] = new int[12];
            for(int i = 0; i<arr2.length; i++){
//            System.out.println(arr2);
                System.out.println(arr2[i]);

            }}

            public void ArrayExamp2() {
                int arr3 = new int[4];
                arr3[0] = 23;
                arr3[1] = 34;
                arr3[2] = 45;
                arr3[3] = 90;

                System.out.println(Arrays.toString(arr3));

            }

}