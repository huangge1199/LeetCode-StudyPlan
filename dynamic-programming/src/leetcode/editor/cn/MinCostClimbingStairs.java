//<p>给你一个整数数组 <code>cost</code> ，其中 <code>cost[i]</code> 是从楼梯第 <code>i</code> 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。</p>
//
//<p>你可以选择从下标为 <code>0</code> 或下标为 <code>1</code> 的台阶开始爬楼梯。</p>
//
//<p>请你计算并返回达到楼梯顶部的最低花费。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>cost = [10,<em><strong>15</strong></em>,20]
//<strong>输出：</strong>15
//<strong>解释：</strong>你将从下标为 1 的台阶开始。
//- 支付 15 ，向上爬两个台阶，到达楼梯顶部。
//总花费为 15 。
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>cost = [<em><strong>1</strong></em>,100,<em><strong>1</strong></em>,1,<em><strong>1</strong></em>,100,<em><strong>1</strong></em>,<em><strong>1</strong></em>,100,<em><strong>1</strong></em>]
//<strong>输出：</strong>6
//<strong>解释：</strong>你将从下标为 0 的台阶开始。
//- 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
//- 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
//- 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
//- 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
//- 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
//- 支付 1 ，向上爬一个台阶，到达楼梯顶部。
//总花费为 6 。
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>2 &lt;= cost.length &lt;= 1000</code></li> 
// <li><code>0 &lt;= cost[i] &lt;= 999</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>数组</li><li>动态规划</li></div></div><br><div><li>👍 1330</li><li>👎 0</li></div>
package leetcode.editor.cn;

// 746:使用最小花费爬楼梯
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new MinCostClimbingStairs().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] sum = new int[cost.length + 1];
            for (int i = 2; i < cost.length + 1; i++) {
                sum[i] = Math.min(sum[i - 1] + cost[i - 1], sum[i - 2] + cost[i - 2]);
            }
            return sum[cost.length];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
