#include<iostream>
using namespace std;
int compute(int a,int n)
{
  if (n == 1)
  {
    return a;
  }
  else
  {
    return a * compute(a,n-1);
  }
}
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a"<<endl;
  std::cin>>a;
  std::cout<<"Enter the value of n"<<endl;
  std::cin>>n;
  int res = compute(a,n);
  std::cout<<"The value of "<<a<<" power "<< n <<" is "<<res<<endl;
}