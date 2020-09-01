#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  std::cin>>r;
  std::cin>>c;
  std::cin>>n;
  if ( n > c && n <= (2 * c))
  {
    std::cout << "It is a mango tree";
  }
  else if (n > ((c-2) * c) && n <= ((c-1) * c))
  {
    std::cout << "It is a mango tree";
  }
  else
  {
    std::cout << "It is not a mango tree";
  }
  return 0;
}