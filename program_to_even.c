#include<stdio.h>

int main(){
int n=0;
printf("Enter the number of elemets: ");
scanf("%d",&n);
int a[n];
printf("Enter the elements: ");
for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
    if(a[i]%2==0){
        printf("%d is even\n",a[i]);
    }
    else{
        printf("%d is odd\n",a[i]);
    }
    printf("\n");
}


}