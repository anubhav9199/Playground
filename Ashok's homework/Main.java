#include<iostream>

using namespace std;

int main()

{

int rows, cols, m1[10][10], m2[10][10], sum[10][10];

cin>>rows;

cin>>cols;

for (int i = 0;i<rows;i++ ) {

for (int j = 0;j < cols;j++ ) {

cin>>m1[i][j];

}

}

for (int i = 0;i<rows;i++ ) {

for (int j = 0;j<cols;j++ ) {

cin>>m2[i][j];

}

}

for (int i = 0;i<rows;i++ ) {

for (int j = 0;j<cols;j++ ) {

sum[i][j]=m1[i][j]+m2[i][j];

cout<<sum[i][j]<<" ";

}

 cout<<"\n";

}


return 0;

}