package TwoSum;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(2);
        twoSum.add(7);
        twoSum.add(11);
        twoSum.add(15);

        int target = 9;
        boolean result = twoSum.find(target);

        System.out.println("Output: " + result);}
}
