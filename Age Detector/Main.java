#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,curr,res;
  std::cin>>birth;
  std::cin>>curr;
  if(curr == 0)
  {
    res = 100 - birth;
  }
  else
  {
    if(curr >= birth)
    {
      res = curr - birth;
    }
    else
    {
      res = (100 - birth) + curr;
    }
  }
  std::cout<<res;
  return 0;
}