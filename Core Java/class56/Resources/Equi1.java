public class Equi1 {
    public static int leftSum(int firstIndex, int lastIndex, int array[]){
        int sum=0;
        for(int i=firstIndex;i<=lastIndex;i++){
             sum = sum+array[i];
        }
        return sum;
    }
    public static int rigtSum(int firstIndex, int lastIndex){
        return 0;
    }
    public static void main(String a[]){
        int[] array = {12342}; 
        int lowIndex = 0,initial = array[0], highIndex = array[array.length-1], mid = 0;
        mid = (array[0]+array[array.length])/2;
        System.out.println(mid);
        lowIndex = mid+1;
        highIndex=mid-1;
      System.out.println(Equi1.leftSum(initial, highIndex, array));
        
    }
}
