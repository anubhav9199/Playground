#include<iostream>
using namespace std;
int main()
{
    int a, b;
    cin >> a >> b;//consider two numbers as 4 and 5
    cout << "Before swapping a= " << a << " and b=" << b<<endl;
  	a = a + b;
    b = a - b;
    a = a - b;
    cout << "After swapping a= " << a << " and b=" << b;
}
