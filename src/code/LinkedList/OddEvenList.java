package code.LinkedList;

/**
 * 项目名称：leetcodeDemo
 * 类 名 称：OddEvenList
 * 类 描 述：TODO 力扣题328 给定单链表的头节点 head ，将所有索引为奇数的节点和索引为偶数的节点分别组合在一起，
 *          然后返回重新排序的列表。第一个节点的索引被认为是 奇数 ， 第二个节点的索引为 偶数 ，以此类推。
 * 创建时间：2022/10/17 下午12:10
 * 创 建 人：chenweihua
 */
public class OddEvenList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }


        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }
    }


    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;


    }


}
