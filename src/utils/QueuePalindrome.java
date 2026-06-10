package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text) {

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for (char c : text.toCharArray()) {
            q1.offer(c);
        }

        for (int i = text.length() - 1; i >= 0; i--) {
            q2.offer(text.charAt(i));
        }

        while (!q1.isEmpty()) {
            if (!q1.poll().equals(q2.poll())) {
                return false;
            }
        }

        return true;
    }

}
