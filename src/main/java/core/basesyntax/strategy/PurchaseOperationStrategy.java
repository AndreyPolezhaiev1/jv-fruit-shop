package core.basesyntax.strategy;

public class PurchaseOperationStrategy implements OperationStrategy {
    private static final int AMOUNT_INDEX = 2;

    @Override
    public int getAmount(int amount) {
        return -amount;
    }
}
