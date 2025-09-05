/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static boolean sum(List<Integer> a, int k) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size(); j++) {
                if (a.get(i) + a.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = scan.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Nhập " + n + " số nguyên: ");
        for (int i = 0; i < n; i++) {
            numbers.add(scan.nextInt());
        }
        System.out.print("Nhập tổng: ");
        int k = scan.nextInt();
        boolean result = sum(numbers, k);
        System.out.print("Có tồn tại 2 số cộng lại bằng " + k + "? " + result);
    }
}
