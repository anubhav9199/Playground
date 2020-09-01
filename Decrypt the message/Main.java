#include <iostream>
using namespace std;

int main() 
{
  // Try out your code here
  int en,net,num,sum = 0;
  std::cin>>en>>net;
  num = en + net;
  for(int i = 1;i<=num/2;i++)
  {
    if(num%i == 0)
    {
      sum += i;
    }
  }
  if(sum == num)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
  return 0;
}