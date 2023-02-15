

public class calculateModulus {
    public static int calculateModulus(int value, int modValue) {
        // base case: if value is less than modValue, then return value
        if (value < modValue) {
            return value;
        }

        // recursive case: subtract modValue from value and call the method recursively with new value
        return calculateModulus(value - modValue, modValue);

    }
}

//This method accepts two parameters: value and modValue. value is the wheel sector value, and modValue is the random integer between 2 and 10 generated in the printModulus method.
//The method has a base case and a recursive case. In the base case, if the value is less than modValue, then the method returns value. In the recursive case, the method subtracts modValue from value and calls the method recursively with the new value until the base case is reached.
//The result of the calculateModulus method is the modulus of value and modValue. Note that this method is using only addition and subtraction to calculate the modulus without using any multiplication, division, modulus, or any other Java methods.
//The calculateModulus method will be used in the printModulus method to calculate the modulus of the wheel sector value and the generated random integer.