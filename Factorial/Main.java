#include<iostream>
int fact(int n)
{
  if(n == 1)
  {
    return 1;
  }
  else
  {
    return n * fact(n-1);
  }
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int res = fact(n);
  std::cout<< "The factorial of " << n <<  " is " << res;
  return 0;
}