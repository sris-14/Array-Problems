public class SecondLarge {
    public int secondLargest(int []a, int n){
        int largest = a[0];
        int slargest = -1;
        for(int i=0; i<n ; i++){
            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            } else if(a[i] < largest && a[i] > slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }

    public int secondSmallest(int []a, int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0; i<n ; i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            } else if(a[i] != smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }
       
        return ssmallest;
    }
    // public static int[] getSecondOrderElements(int n, int []a) {
    //  when datatype : int[] then it'll return like this :
    //     return new int[] {slargest, ssmallest};
    // }
    public static void main(String args[]){
        int a[] ={1,2,4,7,7,5};
        int n= a.length;
        SecondLarge sl = new SecondLarge();
        int slargest = sl.secondLargest(a, n);
        int ssmallest =sl.secondSmallest(a, n);
        System.out.println("second largest : "+slargest+ " & second smallest : " + ssmallest);
    }
}

