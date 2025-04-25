/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*/
//using the hash map to store the compliment and then finding the complement
#include <iostream>
#include <unordered_map>
using namespace std;
class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        // optimised solution
        unordered_map<int, int> map;
        for (int i = 0; i < nums.size(); i++)
        {
            int x = target - nums[i];
            if (map.find(x) != map.end())
            {
                return {map[x], i};
            }
            map[nums[i]] = i;
        }
        return {};
    };
    vector<int> twoSum_naive(vector<int> &nums, int target)
    {
        vector<int> arr(2);
        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = i; j < nums.size(); j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    if (i != j)
                    {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
    }
};

// main is written only for testing and debugging
int main()
{
    vector<int> v = {3, 5, 1, 4, -8};
    int t = 5;
    Solution s;
    print("{}", s.twoSum(v, t));
}
