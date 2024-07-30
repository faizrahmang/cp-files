//quicksort
#include<stdio.h>
int findPivot(int* arr,int s,int e)
{
    int pivot =e;
    int i=s,j=s;
    while(i<pivot)
    {
        if(arr[i]<arr[pivot])
        {
            int r = arr[i];
            arr[i]=arr[j];
            arr[j] = r;
            j++;
        }
        i++;
    }
    int w = arr[pivot];
    arr[pivot]=arr[j];
    arr[j] = w;
    return j;

}

void quickSort(int* arr , int st , int end)
{
    if(st<end)
    {
        int pos = findPivot(arr,st,end);
        quickSort(arr,st,pos-1);
        quickSort(arr,pos+1,end); 
    }
}
int main()
{
    int n ;
    scanf("%d" , &n);
    int arr[n];
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    quickSort(arr,0,n-1);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }

}
