package week12;
import java.util.Arrays;
public class QuickSort {
    public static int[] sort(int arr[],int left, int right){

        if ((left>=0)&& (right<arr.length)&&(right-left>=1)) 
        {
            int i=left;
            int j=right;
            int standard=arr[left];
            while (i!=j)
            {
                while ((arr[j]>=standard)&&(i<j)) {j-=1;}
                while ((arr[i]<=standard)&&(i<j)) {i+=1;}
                if(i<j){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            arr[left]=arr[i];
            arr[i]=standard;
            sort(arr, left, j-1);
            sort(arr, i+1,right);
        }
        return arr;

    }
    
    public static void main(String[] args) {
        int[] arr={ 5, 6, 4, 8, 2, 3, 7, 1, 9 };
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));
    }
    
}
