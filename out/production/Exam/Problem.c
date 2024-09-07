#include <stdio.h>

int main() {

    int n,m;
    printf("n:");
    scanf("%d",&n);

    printf("m:");
    scanf("%d",&m);

    int A[n],B[m];

    

    printf("A:");

    for(int i=0;i<n;i++) {

        scanf("%d",&A[i]);
    }
printf("done");
printf("b:");
    for(int i=0;i<m;i++) {

        scanf("%d",&B[i]);
    }
    
    

    int R[n][m];

    printf("\n");

    for (int i = 0; i < n; i++) {

        for (int j = 0; j < m; j++) {

            if (A[i] > B[j]) {

                R[i][j] = 1;
                printf("(%d, %d) ", A[i], B[j]);
            }
            else
            {
                R[i][j] = 0;
            }
        }
    }

    printf("\n\n");

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            printf("%d ", R[i][j]);
        }
        printf("\n");
    }

    return 0;
}
