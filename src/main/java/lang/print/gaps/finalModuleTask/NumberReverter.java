package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder result = new StringBuilder();

        while (number != 0) {
            int remainderOfDividing = number % 10;
            number /= 10;
            result.append(remainderOfDividing);
        }

        System.out.println(result);
    }
}
