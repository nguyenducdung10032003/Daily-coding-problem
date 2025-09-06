
/*
This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.
 */
import java.util.function.BiFunction;
import java.util.function.Function;

public class Problem2 {

    public class PairFunction {
        // cons: tạo "pair" bằng cách trả về 1 hàm nhận function f
        public static <A, B> Function<BiFunction<A, B, ?>, ?> cons(A a, B b) {
            return f -> f.apply(a, b);
        }

        // car: lấy phần tử đầu tiên
        public static <A, B> A car(Function<BiFunction<A, B, ?>, ?> pair) {
            return (A) pair.apply((x, y) -> x);
        }

        // cdr: lấy phần tử thứ hai
        public static <A, B> B cdr(Function<BiFunction<A, B, ?>, ?> pair) {
            return (B) pair.apply((x, y) -> y);
        }

        // Demo
        public static void main(String[] args) {
            var pair = cons(3, 4);

            System.out.println(car(pair)); // 3
            System.out.println(cdr(pair)); // 4
        }
    }

}
