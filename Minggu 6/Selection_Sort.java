/**
 *
 * @author Tanti
 */
public class Selection_Sort {
    public static void main(String[] args) {
        System.out.println("Array Before Selection Sort");
        int arr[] = {7, 2, 12, 8, 3};
        
            for (int i = 0; i < arr.length; i++ ) {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
        
        int n = arr.length;

            for (int i = 0; i < n; i++){
                int k = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j] < arr[k])
                            k = j;
                            System.out.println(" A : " + arr[i] + " > " + " B : " + arr[k]);
            
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
            System.out.println();
            System.out.println("Array After Selection Sort");
            for (int i = 0; i < arr.length; i++ ) {
                System.out.print(arr[i] + " ");
            }
}
}
