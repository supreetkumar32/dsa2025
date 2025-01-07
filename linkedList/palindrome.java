package linkedList;

import java.util.ArrayList;

public class palindrome {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.data);
            temp=temp.next;
        }
        for(int a:al){
            System.out.println(a);
        }
        int left = 0;
        int right = al.size() - 1;

        while (left < right) {
            if (!al.get(left).equals(al.get(right))) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
