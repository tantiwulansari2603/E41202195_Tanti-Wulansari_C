/**
 *
 * @author Tanti
 */
public class BubbleSort_Descending {
 
    public static void main(String[] args) {
        int arr[] = {7, 2, 12, 8, 3};
    
        System.out.println("Array Before Bubble Sort");
            
            for (int i = 0; i < arr.length; i++ ) {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
       
            int n = arr.length;
            int temp = 0;
            
            System.out.println();
                for(int i = 0; i < n; i++ ) {
                    for(int j = 1; j < (n - i); j++) {
                        if (arr[j-1] < arr[j]) {
                        System.out.println(" A : " +arr[j-1]+ " < "+"B : " +arr[j]+ " Swap");
                    } else {
                        System.out.println(" A : " +arr[j-1]+ " < "+" B : " + arr[j]);
                    }
                        if(arr[j-1] < arr[j]) {
                            temp = arr[j-1];
                            arr[j-1] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                    System.out.println();
                    System.out.println("Array After Bubble Sort Descending");                  
                    for (int i = 0; i < arr.length; i++) {  
                        System.out.print(arr[i] + " ");
                    }      
    }  
}
