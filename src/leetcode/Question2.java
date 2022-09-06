package leetcode;

public class Question2 {

	public static void main(String[] args) {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode answer;
	        ListNode list = new ListNode(0);
	        answer = list;
	        boolean first = true;
	        int sum = 0;
	        int carry = 0;
	        while(l1 != null || l2 != null){
	            if(l1 == null){
	                l1 = new ListNode(0);
	            }
	            if(l2 == null){
	                l2 = new ListNode(0);
	            }
	            list.next = new ListNode(0);
	            list = list.next;
	            sum = l1.val + l2.val;
	            if(carry == 1){
	                sum++;
	            }
	            carry = 0;
	            if(sum > 9){
	                carry = 1;
	                sum %= 10;
	            }
	            list.val = sum;
	            if(first){
	                answer = list;
	                first = !first;
	            }
	            l1 = l1.next;
	            l2 = l2.next;
	        }
	        if(carry == 1){
	            list.next = new ListNode(1);
	        }
	        return answer;
	    }
	}

}
