/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
link: https://leetcode.com/problems/two-sum/description/
*/
#include <iostream>
using namespace std;
class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
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
    };
};
// main is written only for testing and debugging
int main()
{
    vector<int> v = {3, 5, 1, 4, -8};
    int t = 5;
    Solution s;
    print("{}", s.twoSum(v, t));
}
