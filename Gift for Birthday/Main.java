#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year;
  std::cin>>year;
  if (year % 4 == 0)
  {
    if (year % 100 == 0)
    {
      if (year % 400 == 0)
        std::cout << year << " is a leap year";
      else
        std::cout << year << " is not a leap year";
    }
    else
      std::cout << year << " is a leap year";
  }
  else
    std::cout << year << " is not a leap year";
  return 0;
}