#include<stdio.h>

int main()

{

char str[100];

int i=0; int l=0;

scanf("%s",str);

while(str[i]!='\0')

{

l++;

i++;

}

printf("The number of letters in the name is %d",l);

return 0;

}