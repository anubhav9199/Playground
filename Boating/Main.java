#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int na,nc,bw,aw = 75,cw = 30,tw;
  std::cin>>bw;
  std::cin>>na;
  std::cin>>nc;
  tw = (aw * na) + (cw * nc);
  if (bw >= tw)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}