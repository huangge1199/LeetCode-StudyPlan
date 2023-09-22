//<p>假设你正在爬楼梯。需要 <code>n</code>&nbsp;阶你才能到达楼顶。</p>
//
//<p>每次你可以爬 <code>1</code> 或 <code>2</code> 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 2
//<strong>输出：</strong>2
//<strong>解释：</strong>有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 3
//<strong>输出：</strong>3
//<strong>解释：</strong>有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 45</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>记忆化搜索</li><li>数学</li><li>动态规划</li></div></div><br><div><li>👍 3256</li><li>👎 0</li></div>
package leetcode.editor.cn;

// 70:爬楼梯
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            if (n < 3) {
                return n;
            }
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
