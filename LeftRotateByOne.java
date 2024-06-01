public class LeftRotateByOne {

    public static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
         int temp = arr[0];
         for(int i=1; i<n ; i++){
             arr[i-1] = arr[i];
         }
         arr[n-1] = temp;

         return arr;
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int rotateArray[] = rotateArray(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(rotateArray[i] + " ");
        }
        
    }
}
