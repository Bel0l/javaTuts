//public class DuplicatElementsArray  {
//        public static String[] removeDuplicates(String[] arr) {
//            int n = arr.length;
//            String[] unique = new String[n];  // Temporary array to store unique strings
//            int j = 0;  // Index for unique strings
//
//            for (int i = 0; i < n; i++) {
//                boolean isDuplicate = false;
//
//                // Check if arr[i] already exists in the unique array
//                for (int k = 0; k < j; k++) {
//                    if (arr[i].equals(unique[k])) {  // Check for duplicates
//                        isDuplicate = true;  // Duplicate found
//                        break;
//                    }
//                }
//
//                // If no duplicate, add the string to the unique array
//                if (!isDuplicate) {
//                    unique[j] = arr[i];
//                    j++;  // Move to the next position
//                }
//            }
//
//            // Copy unique strings to a new array of appropriate size
//            String[] result = new String[j];
//            for (int i = 0; i < j; i++) {
//                result[i] = unique[i];
//            }
//
//            return result;  // Return the array without duplicates
//        }
//
//        public static void main(String[] args) {
//            String[] arr = {"apple", "banana", "apple", "orange", "banana"};  // Example array
//
//            // Remove duplicates
//            String[] uniqueArr = removeDuplicates(arr);
//
//            // Print the unique elements
//            for (String str : uniqueArr) {
//                System.out.print(str + " ");
//            }
//        }
//    }
//
//
//********************************************************************************

//  USING HASHSET
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class DuplicatElementsArray {
//    public static void main (String [] args){
//
//        String[] Cars = {"BMW", "Audi" , "Mercedez", "Lexus", "BMW"};
//        Set<String> store = new HashSet<>();
//        for (String car : Cars){
//            if(store.add(car) == false){
//                System.out.println("duplicate element is" + car);
//            }
//        }
//    }
//}
//

//*****************************************************************************
//
//public class Array {
//    public static void main (String []args){
//        String[] Cars = {"BMW", "Toyota","Suzuki" , "BMW", "KIA"};
//
//        for (String Car : Cars){
//            System.out.println(Car);
//        }
//
//
//        for (int i = 0; i < Cars.length; i++) {
//            for ( int j= 1+i ; j < Cars.length; j++){
//                if (Cars[i] == Cars[j]){
//
//                    System.out.println("duplicate found: " + Cars[i]);
//                    duplicate=true;
//                }
//            }
//        }
//        if (duplicate == false){
//            System.out.println("no duplicate found");
//        }
//
//    }
//
//}

//*********************************************************************


public class DuplicatElementsArray {
    public static void main (String []args){
        String[] Cars = {"BMW", "Toyota","Suzuki" , "BMW", "KIA","Toyota"};

        for (String Car : Cars){
            System.out.println(Car);
        }
        System.out.println("************************************************************");


        String [] uniqueCar = new String[Cars.length];
        int uniqueIndex = 0;
        boolean duplicate = false;

        for (int i =0 ; i<Cars.length; i++){
            boolean isDuplicate = false;
            for (int j=0 ; j < uniqueIndex; j++){
                if (Cars[i].equals(uniqueCar[j])){
                    isDuplicate = true;
                    duplicate = true;
                    break;
                }
            }

            if (!isDuplicate){
                uniqueCar[uniqueIndex] = Cars[i];
                uniqueIndex++;
            }
        }

        for (int i=0; i< uniqueIndex; i++){
            System.out.println(uniqueCar[i]);
        }
        if (!duplicate){
            System.out.println("no duplicate found");
        }

    }

}