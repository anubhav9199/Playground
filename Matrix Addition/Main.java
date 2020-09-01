#include<iostream>

#include<cstdlib>

using namespace std;

int i,j;

int** memory(int c,int r){

int **a;

a=(int **)malloc(c*sizeof(int*));

for(i=0;i<c;i++)

*(a+i)=(int *)malloc(r*sizeof(int));

return a;

}

int main()

{

int **a,**b,r,c;

cin>>r>>c;

a=memory(c,r);

b=memory(c,r);

for(i=0;i<r;i++){

for(j=0;j<c;j++){

cin>>a[i][j];

}

}

for(i=0;i<r;i++){

for(j=0;j<c;j++){

cin>>b[i][j];

}

}for(i=0;i<r;i++){

for(j=0;j<c;j++){

cout<<a[i][j]+b[i][j]<<" ";

}cout<<"\n";

}

return 0;

}