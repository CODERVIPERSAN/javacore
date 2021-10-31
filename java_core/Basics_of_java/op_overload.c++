#include<iostream>
using namespace std;

class Complex
{
public:
    int img,real;
public:
    Complex(int i=0,int r=0){
        real = r;
        img = i;
    }

    Complex operator + ( Complex const &obj){
        Complex ans;
        ans.real = real+obj.real;
        ans.img = img +obj.img;
        return ans;

}


};



int main(int argc, char const *argv[])
{
 Complex c1(1,2),c2(3,4),c3(1,1);
 Complex ans = c1+c2+c3;

 cout<<ans.real<<"+i"<<ans.img<<endl;


}
