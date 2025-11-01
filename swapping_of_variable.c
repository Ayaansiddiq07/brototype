/*lets sorting variable using array*/
#include<stdio.h>

int main(){
    int n=0,i,j;
    int a[n];
    printf("Enter the number of variables to swap: ");
    scanf("%d", &n);
    printf("Enter the variables: ");
    for(i = 0; i < n; i++){
        scanf(" %d", &a[i]);
    }
    for(i=0; i < n; i++){
        for(j=i+1; j < n; j++){
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("The sorted variables are: ");
    for(i = 0; i < n; i++){
        printf("%d ", a[i]);
    }
    printf("\n");
}