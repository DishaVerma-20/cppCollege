#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin >> n;
    int pcount = 0;
    int fcount = 0;
    string status;
    int mark;
    for (int i = 0; i<=n ; i++){
        cin >> status >> mark;

        if (status == "Pass" && mark>75){
            pcount++;
        }else if (status == "Fail" && mark<50){
            fcount++;
        }
        cout << pcount << " " << fcount << endl;
        return 0;

    }



}
