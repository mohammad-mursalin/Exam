#include<stdio.h>
int main()
{
    int fiN = 0,sN = 1 ,fN,n;

    printf("The input consist single number of integer n : ");
    scanf("%d",&n);

    

    for(int i = 0 ;i < n-2;i++)
    {


        fN = fiN + sN;
        fiN = sN;
        sN = fN;

        printf(",%d",fN);

        
    }
    int fib[n];
    fib[0]=0;
    fib[1]=1;
    for (int i = 2; i < n; i++)
    {
        fib[i]=
    }
    

}
