/*
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
Return the answer with the smaller index first.
Example 1:
Input:
nums = [3,4,5,6], target = 7
Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
*/

#include <iostream>
#include <vector>
#include <unordered_map>
class Solution
{
public:
    std::vector<int> twoSum(std::vector<int> &nums, int target)
    {
        std::unordered_map<int, int> map;
        for (int i = 0; i < nums.size(); i++)
        {
            int x = target - nums[i]; // complement
            if (map.find(x) != map.end())
                return {map[x], i};
            map[nums[i]] = i;
        }
        return {};
    }
};

int main()
{
    Solution s1;
    std::vector s = {3, 4, 5, 6};
    int t = 7;
    std::vector ans = s1.twoSum(s, t);
    std::print("{}", ans);
    return 0;
}