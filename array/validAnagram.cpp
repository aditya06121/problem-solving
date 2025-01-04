/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
Input: s = "racecar", t = "carrace"
Output: true
*/
#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;
class Solution
{
public:
    bool isAnagram(string s, string t)
    {
        unordered_map<char, int> s1;
        unordered_map<char, int> s2;
        for (int i = 0; i < s.size(); i++)
        {
            s1[s[i]]++;
        }
        for (int i = 0; i < t.size(); i++)
        {
            s2[t[i]]++;
        }
        if (s1 == s2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};
int main()
{
    string a = "xx";
    string b = "xx";
    Solution s;
    print("{}", s.isAnagram(a, b));
    return 0;
}
