#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float ht,res;
  std::cin>>n;
  std::cin>>ht;
  if(n == 1)
  {
    res = n * ht;
    printf("%0.2f",res);
  }
  else if(n == 2)
  {
    res = ht + ((ht * 50)/100);
    printf("%0.2f",res);
  }
  else if(n == 3)
  {
    res = ht * 2;
    printf("%0.2f",res);
  }
  else
  {
    std::cout<<"Number of items is more";
  }
  return 0;
}