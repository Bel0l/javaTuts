public class BubbleSort {
    public static void main (String [] args){

        int [] nums = {6,9,7,5,3,4};
        int temp = 0;

        System.out.println("Before Sorting" );
        for (int num : nums){
            System.out.print(num + " " );
        }
//      *** Descending Order ***
        for (int i = 0 ; i < nums.length; i++){
            for (int j=i+1 ; j <nums.length; j++){
                if (nums[j] > nums[i]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]= temp;
                }
            }

        }

        System.out.println("\n" + "Descending Order Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

//      *** Ascending Order ***
        for (int i = 0; i <nums.length ; i++){
            for (int j = i+1 ; j<nums.length; j++){
                if (nums[j] < nums [i]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("ascending order sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
//        max value from array
        System.out.println( "\n" + "max value: " + nums[nums.length -1] +"\n");

//        ***Reversing array***
        System.out.println("Reversing an array");
        for (int i= nums.length -1 ; i >= 0 ; i--){
                System.out.print(nums[i] + " ");
        }
    }
}
