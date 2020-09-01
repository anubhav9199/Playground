#include<iostream>
int main ()
{
  int n, a=11, i, num;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    num=a*a;
    std::cout<<num<<" ";
    a=a+4;
  }
  return 0;
}