#include <stdio.h>
int main()
{
    int fiN = 0, sN = 1, fN, n;

    printf("The input consist single number of integer n : ");
    scanf("%d", &n);

    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        printf("%d", fiN);
    }
    else
    {
        printf("%d,%d", fiN, sN);

        for (int i = 0; i < n - 2; i++)
        {

            fN = fiN + sN;
            fiN = sN;
            sN = fN;

            printf(",%d", fN);
        }
    }
}