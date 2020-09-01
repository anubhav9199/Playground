#include<iostream>
int gcd(int n1, int n2)
{
  if (n2 != 0)
  {
    return gcd(n2, n1 % n2);
  }
  else 
  {
    return n1;
  }
}
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}