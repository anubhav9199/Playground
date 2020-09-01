#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int famt,fdis,fchg,fpr,samt,sdis,schg,spr,aamt,adis,achg,apr;
  std::cin>>famt;
  std::cin>>fdis;
  std::cin>>fchg;
  std::cin>>samt;
  std::cin>>sdis;
  std::cin>>schg;
  std::cin>>aamt;
  std::cin>>adis;
  std::cin>>achg;
  fpr = famt - ((famt * fdis)/100) + fchg;
  spr = samt - ((samt * sdis)/100) + schg;
  apr = aamt - ((aamt * adis)/100) + achg;
  std::cout<<"In Flipkart Rs."<<fpr<<endl;
  std::cout<<"In Snapdeal Rs."<<spr<<endl;
  std::cout<<"In Amazon Rs."<<apr<<endl;
  if(fpr <= spr && fpr <= apr)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(spr <= fpr && spr <= apr)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
  return 0;
}