#include<stdio.h>
int main(int argc, char const *argv[])
{
    int n;
    printf("enter n: ");
    scanf("%d", &n);

    int a[n];
    a[0]=1;
    for (int i = 1; i < n; i++)
    {
        for (int j = 2; i <=n; i++)
        {
            int m=a[i]+a[i+1];
            if (m%j!=0)
            {
                a[i]=m;
            }
            
        }
        
    }
    for (int i = 0; i < n; i++)
    {
        printf(" %d ",a[i]);
    }
    
    
    return 0;
}
