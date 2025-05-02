/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
Example 1:
Input: s = "racecar", t = "carrace"
Output: true
Example 2:
Input: s = "jar", t = "jam"
Output: false
*/

#include <iostream>
#include <unordered_map>

class Solution
{
public:
    bool isAnagram(std::string s, std::string t)
    {
        std::unordered_map<char, int> a1;
        std::unordered_map<char, int> a2;
        for (int i = 0; i < s.size(); i++)
            a1[s[i]]++;
        for (int i = 0; i < t.size(); i++)
            a2[t[i]]++;
        if (a1 == a2)
            return true;
        else
            return false;
    }
};

int main()
{
    Solution s1;
    std::string a = "jar";
    std::string b = "raj";
    bool c = s1.isAnagram(a, b);
    std::print("{}", c);
}