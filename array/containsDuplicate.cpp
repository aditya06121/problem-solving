/*
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
unordered_set is used instead of set stl because unordered_set uses hash map data structure internally which has less lookup time.
*/

#include <iostream>
#include <unordered_set>
#include <vector>
using namespace std;

class Solution
{
public:
    bool hasDuplicate(vector<int> &nums)
    {
        unordered_set<int> s;
        for (int i = 0; i < nums.size(); i++)
        {
            if (s.find(nums[i]) == s.end())
            {
                s.insert(nums[i]);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
};
int main()
{
    vector<int> v = {1,3,4,5,6,7,8,9,10,30,30};
    Solution s1;
    print("{}",s1.hasDuplicate(v));
    return 0;
}