package Module_2_Enterprise;

import java.util.List;

/**
 * Created by zagor on 23.08.2016.
 */
public interface Validator<T> {
    boolean isValid(T result, Class<? extends List> classObject) throws IllegalAccessException, InstantiationException;
}
