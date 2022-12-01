package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first + "\n" + second);
    }

    public static void main(String[] args) {
        BitwiseValuesSwap swap=new BitwiseValuesSwap();
        swap.swap(5,2);
    }
}
