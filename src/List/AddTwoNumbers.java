package List;

/**
 * 项目名称：leetcodeDemo
 * 类 名 称：AddTwoNumbers
 * 类 描 述：TODO 力扣题2 两数相加
 * 创建时间：2022/12/5 下午12:47
 * 创 建 人：chenweihua
 */
public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry=0;
        while (l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;
            int sum = x+y+carry;
            carry = sum/10;
            sum=sum%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        if (carry==1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}
