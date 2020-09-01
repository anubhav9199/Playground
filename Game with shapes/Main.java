#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rad,len;
  std::cin>>rad;
  std::cin>>len;
  if(len >= (2 * rad))
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
  return 0;
}