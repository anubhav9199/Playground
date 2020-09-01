#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,amt;
  std::cin>>u;
  if (u <= 200)
    amt = (u * 0.5);
  else if (u <= 400)
    amt = (u * 0.65) + 100;
  else if (u <= 600)
    amt = (u * 0.80) + 200;
  else if (u > 600)
    amt = (u * 1.25) + 425;
  std::cout << "Rs." << amt;
}