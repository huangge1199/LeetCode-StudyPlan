//<p>泰波那契序列&nbsp;T<sub>n</sub>&nbsp;定义如下：&nbsp;</p>
//
//<p>T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1, 且在 n &gt;= 0&nbsp;的条件下 T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+2</sub></p>
//
//<p>给你整数&nbsp;<code>n</code>，请返回第 n 个泰波那契数&nbsp;T<sub>n </sub>的值。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre><strong>输入：</strong>n = 4
//<strong>输出：</strong>4
//<strong>解释：</strong>
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre><strong>输入：</strong>n = 25
//<strong>输出：</strong>1389537
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>0 &lt;= n &lt;= 37</code></li> 
// <li>答案保证是一个 32 位整数，即&nbsp;<code>answer &lt;= 2^31 - 1</code>。</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>记忆化搜索</li><li>数学</li><li>动态规划</li></div></div><br><div><li>👍 279</li><li>👎 0</li></div>
package leetcode.editor.cn;

// 1137:第 N 个泰波那契数
public class NThTribonacciNumber {
    public static void main(String[] args) {
        Solution solution = new NThTribonacciNumber().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int tribonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n < 3) {
                return 1;
            }
            int[] arr = new int[n + 1];
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            return arr[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
