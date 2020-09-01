#include<iostream>
int main()
{
  // Type your code here
  int num,count = 0;
  std::cin>>num;
  do
  {
    num = num / 10;
    ++count;
  }while(num != 0);
  std::cout<<count;
  return 0;
}