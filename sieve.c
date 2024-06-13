#include<stdio.h>
#include<stdlib.h>
int countSieve(int n /*,int pos*/)
{
    int *checkArray = (int*)calloc(n+1,sizeof(int));
    int count=0;
    if(n>1)
    {
        count++;
        checkArray[0]=1;
        printf("%d ",2);
    }
    if(n>2)
    {
        count++;
        checkArray[1]=1;
        printf("%d ",3);
    }
    if(n<2)
        return 0;
    for(int i=2;i*i<=n;i++)
    {
        if(!checkArray[i])
        {
            for(int j=i*i;j<=n;j+=i)
            {
                checkArray[j]=1;
            }
        }
    }
    
    /*
    for(int i=2;i<=n;i++)
    {
        if(!checkArray[i])
        {
            printf("%d ",i);
        }
    }
    */

    /*
    int* final = (int*)calloc(n/2,sizeof(int));
    int len=0;

      to get the particular prime at a particular position
    for(int i=0;i<=n;i++)
    {
        if(checkArray[i]==0)
        {
            final[len] = i;
            len++;
        }
    }

    if(pos<=len && pos>=1)
    {
        printf("\n The number at position is: %d",final[pos-1]);
    }
    else
        printf("\nInvalid Position");
    return count;
    */
   int limit = n/6;
   for(int i=1;i<=limit;i++)
   {
        if((6*i)-1<=n && checkArray[6*i-1] ==0)
        {
            printf("%d ",6*i-1);
            count++;
        }
        if((6*i)+1<=n && checkArray[6*i+1] ==0)
        {
            printf("%d ",6*i+1);
            count++;
        }
   }
   return count;

}
int main()
{
    int n,pos;
    scanf("%d",&n);
    /*scanf("%d",&pos);*/
    printf("\n Total count of prime numbers :%d",countSieve(n /*,pos*/));
}