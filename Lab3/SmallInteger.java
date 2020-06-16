package Lab3;

/**
 * This class implements the arithmetic operations with integers not exceeding the absolute value of 10000.
 * @author Bardadin Artyom.
 */
public class SmallInteger extends CalculatorPanel{
    /**
     * The value of the SmallInteger object.
     */
    public int number;
    /**
     * This method sums two objects of the SmallInteger class.
     * @param arg Class object SmallInteger.
     * @return Addition value.
     */
    public SmallInteger add(SmallInteger arg){
        SmallInteger returnObject = new SmallInteger();
        returnObject.number = 0;
        try {
            returnObject.number = number + arg.number;
            if (returnObject.number < -10000 | returnObject.number > 10000) {
                throw new NumberFormatException("Result is out of range.");
            } else {
                return returnObject;
            }
        } catch (NumberFormatException e) {
            arg.number=10000;
            return arg;
        }

    }

    /**
     * This method subtracts two objects of the SmallInteger class.
     * @param arg Class object SmallInteger.
     * @return Subtraction value.
     */
    public SmallInteger sub(SmallInteger arg){
        SmallInteger returnObject = new SmallInteger();
        returnObject.number = 0;
        try {
            returnObject.number = number - arg.number;
            if (returnObject.number < -10000 | returnObject.number > 10000) {
                throw new NumberFormatException("Result is out of range.");
            } else {
                return returnObject;
            }
        } catch (NumberFormatException e) {
            arg.number=10000;
            return arg;
        }
    }

    /**
     * This method multiplies two objects of the SmallInteger class.
     * @param arg Class object SmallInteger.
     * @return Multiplication value.
     */
    public SmallInteger mul(SmallInteger arg){
        SmallInteger returnObject = new SmallInteger();
        returnObject.number = 0;
        try {
            returnObject.number = number * arg.number;
            if (returnObject.number < -10000 | returnObject.number > 10000) {
                throw new NumberFormatException("Result is out of range.");
            } else {
                return returnObject;
            }
        } catch (NumberFormatException e) {
            arg.number=10000;
            return arg;
        }
    }

    /**
     * This method divides two objects of the SmallInteger class.
     * @param arg Class object SmallInteger.
     * @return Division value.
     */
    public SmallInteger div(SmallInteger arg){
        SmallInteger returnObject = new SmallInteger();
        returnObject.number = 0;
        try {
            returnObject.number = number / arg.number;
            if (returnObject.number < -10000 | returnObject.number > 10000) {
                throw new NumberFormatException("Result is out of range.");
            } else {
                return returnObject;
            }
        } catch (NumberFormatException e) {
            arg.number=10000;
            return arg;
        }
    }

    /**
     * This method implements the modulo of two objects of class SmallInteger
     * @param arg Class object SmallInteger.
     * @return Modulo value.
     */
    public SmallInteger mod(SmallInteger arg){
        SmallInteger returnObject = new SmallInteger();
        returnObject.number = 0;
        try {
            returnObject.number = number % arg.number;
            if (returnObject.number < -10000 | returnObject.number > 10000) {
                throw new NumberFormatException("Result is out of range.");
            } else {
                return returnObject;
            }
        } catch (NumberFormatException e) {
            arg.number=10000;
            return arg;
        }
    }

    public SmallInteger(int x){
            number = x;
    }


    public SmallInteger() {}
}
