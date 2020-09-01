#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,r;
  double interest,amount,disc,finall;
  std::cin>>x>>y>>r;
  interest=(x*y*r)/100;
  amount=x+interest;
  disc=interest*2/100;
  finall=x+interest-disc;
  cout<<interest<<endl;
  cout<<amount<<endl;
  cout<<disc<<endl;
  cout<<finall<<endl;  
  return 0;
}