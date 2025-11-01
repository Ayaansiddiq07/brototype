#include<stdio.h>

int main(){
    int sum=0;
    int n=0;
    printf("Enter the number how long the string is: ");
    scanf("%d", &n);
    char a[n];
    printf("Enter a string: ");
    for(int i = 0; i < n; i++){
        scanf(" %d", &a[i]);
    }
    printf("You entered: ");
    for(int i = 0; i < n; i++){
        printf("%d,", a[i]);
        sum=sum+a[i];
    }
    printf("\tSum: %d",sum);
}