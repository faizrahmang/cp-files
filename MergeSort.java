import java.util.*;
public class mergeSort{
    public static void merge(int arr[] , int l ,int m ,int h)
    {
        int s1 = m-l+1;
        int s2 = h-m;
        
        int k=l;
        int left[] = new int[s1];
        int right[] = new int[s2];
        for(int i=0;i<s1;i++)
        {
            left[i] = arr[i+l];
        }
        for(int i=0;i<s2;i++)
        {
            right[i] = arr[m+1+i];
        }
        int i=0,j=0;
        while(i<s1 && j<s2)
        {
            if(left[i] < right[j])
            {
                arr[k++] = left[i];
                i++;
            }
            else{
                arr[k++] = right[j];
                j++;
            }
        }
        while(i<s1)
        {
            arr[k++] = left[i++];
        }
        while(j<s2)
        {
            arr[k++] = right[j++];
        }

    }
    public static void mergesort(int arr[] , int l , int h)
    {
        if(l<h)
        {
            int mid=(l+h)/2;
            mergesort(arr ,l,mid );
            mergesort(arr ,mid+1,h);

            merge(arr,l,mid,h);

        }
    }
    public static void main(String args[]) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr , 0 , arr.length-1);
        for(int i:arr)
        {
           System.out.print(i + " ");
        }
    }
} 