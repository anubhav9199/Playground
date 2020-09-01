#include<iostream>

using namespace std;

int main()

{

 int b,m,n,i,flag;

 cin>>n;

 int a[n];

 for( i = 0;i<n;i++)

 {

   cin>>a[i];

 }

 cin>>m;

 for(i=0;i<n;i++)

 {

 if(a[i]==m)

 {

   flag =1;

   break;

 }

 }

if(flag == 1)

 {

   

 cout<<"She passed her exam";

 }

 else

 {

   cout<<"She failed";

 }

}

