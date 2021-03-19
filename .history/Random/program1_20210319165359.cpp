#include<iostream>
#include <string>

using namespace std;


int main() {
    string s;
    cin>>s;
    int n = s.size();

    string f = s[n-1] + s.substr(0,n-1);
    string b = s.substr(1,n) + s[0];
    cout<<(f == b)<<endl;

    return 0;
}