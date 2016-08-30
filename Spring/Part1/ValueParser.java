package Part1;

/**
 * Created by zagor on 29.08.2016.
 */
public interface ValueParser {
    double parse(String stringValue) throws NumberFormatException;

    String getString(double value);

    void setPrecision(int precision);

    char dataTypeIdentitySymbol();
}
