#include <iostream>
int main() 
{
  // Type your code here
  int n,rev = 0,rem;
  std::cin>>n;
  while(n!=0)
  {
    rem = n%10;
    rev = rev*10 + rem;
    n/=10;
  }
  std::cout<<rev;
  return 0;
}