public class CheckSorted {

    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1; i<n ; i++){
            if(a[i] >= a[i-1]){

            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String args[]){
        int a[] = {1,2,2,4,5};
        int n = a.length;
        System.out.println(isSorted(n, a));
    }
}
