#include<stdio.h>
int main() {
    char fname[25], lname[25];
    printf("Enter first name : ");
    scanf("%s",fname);

    printf("Enter last name: ");
    scanf("%s",lname);
    printf("Your name: %s %s \n ",fname, lname);
    return 0;
}