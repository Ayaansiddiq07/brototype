#include<stdio.h>

int main(){
    int n=0;
    int s_key=0;
    printf("Enter the number ");
    scanf("%d", &n);
    printf("Enter the search key: ");
    scanf("%d", &s_key);
    int a[n];
    printf("Enter a string: ");
    for(int i = 0; i < n; i++){
        scanf(" %d", &a[i]);
    }
    /*note that for the user search position will be i+1 but coder know the position is [i]*/
    for(int i = 0; i < n; i++){
        if(a[i]==s_key){
            printf("Found the key %d at index %d\n", s_key, i+1);
            return 0;
        }
    }
}