package Part1;

import java.util.List;

/**
 * Created by zagor on 30.08.2016.
 */
public interface BinaryOperationProvider {
    List<BinaryOperation> getBinaryOperations();

    void addOperation(BinaryOperation binaryOperation);

    void init();
}
