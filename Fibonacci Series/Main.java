#include<iostream>
int fib(int n)
{
  if (n == 1)
  {
    return 0;
  }
  if (n == 2)
  {
    return 1;
  }
  return (fib(n-1) + fib(n-2));
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int res = fib(n);
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<res;
  return 0;
}