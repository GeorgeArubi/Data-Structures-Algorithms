import java.util.Arrays;
class InsertionSort { 
    int[] insertionSort(int arr[]){ 
        int n = arr.length; 
        
        for (int i=1; i<n; ++i){ 
            int key = arr[i]; 
            int j = i-1; 
            
            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
        return arr;
    } 
  
    public static void main(String args[]){  
      InsertionSort ob = new InsertionSort();          
        System.out.println(Arrays.toString(ob.insertionSort(new int[] {5,2,4,3,10,7,1,9,6,8})));
    } 
}
