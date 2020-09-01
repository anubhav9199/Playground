#include <iostream>
using namespace std;

int main() 
{
  // Try out your code here
  int s,e,sum = 0;
  std::cin>>s>>e;
  int i = s,u = s;
  while (i <= e) 
  {
    while (u <= e) 
    {
      if (u < i) 
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
  return 0;
}