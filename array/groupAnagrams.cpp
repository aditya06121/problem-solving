/*
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
*/
#include <iostream>
#include <vector>
#include <map>
using namespace std;
class Solution
{
public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {
        vector<string> ls;
        for (string vals : strs)
        {
            ls.push_back(vals);
        }
        vector<string> l2 {"act","by","etc"};
        vector<vector<string>> l3 {ls,l2};
        return l3;
    }
};
int main()
{
    vector<string> s = {"act", "pots", "tops", "cat", "stop", "hat"};
    Solution s1;
    print("{}", s1.groupAnagrams(s));
}
