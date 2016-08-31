package Part1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 30.08.2016.
 */
public class SimpleBinaryOperationProvider implements BinaryOperationProvider {
    private List<BinaryOperation> binaryOperations = new ArrayList<>();

    @Override
    public List<BinaryOperation> getBinaryOperations() {
        return binaryOperations;
    }

    @Override
    public void addOperation(BinaryOperation binaryOperation) {
        binaryOperations.add(binaryOperation);

    }

    @Override
    public void init() {
        addOperation(new PlusOperation());
        addOperation(new MinusOperation());
    }
}
