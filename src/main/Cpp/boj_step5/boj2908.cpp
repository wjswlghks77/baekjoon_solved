#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string A, B;
    cin >> A >> B;
    reverse(A.begin(), A.end());
    reverse(B.begin(), B.end());
    cout << ((stoi(A) > stoi(B)) ? stoi(A) : stoi(B));
}