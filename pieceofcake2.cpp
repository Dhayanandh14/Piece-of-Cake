#include<iostream>
using namespace std;
int main() {
   int ll, n, v, h;
	cin >> n >> v >> h;

	cout << max(v,n-v)*max(h,n-h)*4 << endl;
}