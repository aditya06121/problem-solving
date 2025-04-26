/*
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
solution: using hash map to store and check for duplicate, this case set data structure is used.
*/
#include <iostream>
#include <vector>
#include <unordered_set>

class Solution
{
public:
    bool hasDuplicate(std::vector<int> &nums)
    {
        std::unordered_set<int> set;
        for (int i : nums)
        {
            if (set.find(i) != set.end())
            {
                return true;
            }
            set.insert(i);
        }
        return false;
    }
};

int main()
{
    Solution sol;
    std::vector<int> nums1 = {1, 2, 3, 3};
    std::vector<int> nums2 = {1, 2, 3, 4};
    std::print("{}\n", sol.hasDuplicate(nums2));
    return 0;
}