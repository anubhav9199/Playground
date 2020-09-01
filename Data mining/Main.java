#include<iostream>
using namespace std;
int main()
{
 int temp,esum=0,osum=0;
 cin>>temp;
 while(temp!=0)
 {
   int rem=temp%10;
   if(rem%2==0)
     esum=esum+rem;
   else
     osum=osum+rem;
   temp=temp/10;
 }
 if(esum==osum)
   cout<<"Yes";
 else
   cout<<"No";
 return 0;
}