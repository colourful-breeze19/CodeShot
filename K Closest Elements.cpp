#include<bits/stdc++.h>
using namespace std;

int main(){
    int a[]={1,2,4,5,6,7,8,9};
    int size = sizeof(a)/sizeof(a[0]);
    int k=3,x=3;
    priority_queue <pair<int,int>> maxHeap;
    for(int i=0;i<size;i++)
    {
        maxHeap.push({abs(a[i]-x), a[i]});
        if(maxHeap.size()>k)
        {
            maxHeap.pop();
        }
    }
    while(maxHeap.size()>0)
    {
        cout<<maxHeap.top().second<<" ";
        maxHeap.pop();
    }
    return 0;
}
