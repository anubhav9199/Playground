#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int pet,dis;
  std::cin>>mil;
  std::cin>>pet;
  std::cin>>dis;
  if(dis > (mil * pet))
  {
    std::cout<<"Cannot reach";
  }
  else
  {
    std::cout<<"Can reach";
  }
  return 0;
}