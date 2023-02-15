# This will contains the explanation of each classes used in the game


## playTheGame function

The if statements check the range of the wheel sector value. If the value falls within a certain range, the corresponding method is called:

- If the value is between 1 and 99 inclusive, the printHailstoneSequence method is called.
- If the value is between 100 and 199 inclusive, the displayOddNumbers method is called.
- If the value is between 200 and 299 inclusive, a random value is generated using the generateRandomNumber method, and the calculateModulus method is called with both the sector value and the generated random value as input parameters.
- The output of the method depends on which recursive method is called.


## generateRandomNumber function

In summary, this method takes in two integers `min` and `max` representing the range of values we want to generate a random number from. It uses the Random class to create a new instance of a random number generator, and then generates a random integer within the range of `[0, max - min] (inclusive)`. We add min to this value to shift the range to `[min, max]`, and then return the resulting random integer.

## calculateModulus function

- This method accepts two parameters: `value` and `modValue`. `value` is the wheel sector value, and modValue is the random integer between 2 and 10 generated in the `printModulus` method.

- The method has a base case and a recursive case. In the base case, if the value is less than modValue, then the method returns value. In the recursive case, the method subtracts modValue from value and calls the method recursively with the new value until the base case is reached.

- The result of the calculateModulus method is the modulus of `value` and `modValue`. Note that this method is using only addition and subtraction to calculate the modulus without using any multiplication, division, modulus, or any other Java methods.

- The calculateModulus method will be used in the printModulus method to calculate the modulus of the wheel sector value and the generated random integer.

## displayOddNumbers function

- This method accepts two parameters: value and end. value is the wheel sector value, and end is the end value till which the odd numbers need to be displayed.

- The method has a base case and a recursive case. In the base case, if the value is greater than end, then the method returns. In the recursive case, if the value is odd, then the method prints it.

- Finally, in the recursive step, the displayOddNumbers method is called with the value+1 and end as parameters. This process continues until the base case is reached, and all the odd numbers between value and end are displayed.

## spinTheWheel function

* This method randomly selects a sector number on the spinning wheel.
* It first generates a random integer between 1 and 5 (inclusive) to represent the sector number.
* It then retrieves the corresponding value from the spinningWheel list and returns it.

## generateSpinningWheel function

In summary, this method generates a spinning wheel with 5 unique random values ranging from 1 to 299. It first checks if the spinning wheel already has 5 values, and if not, generates a random number between 1 to 299. It then checks if this number is already in the spinning wheel, and if not, adds it to the wheel. Finally, it recursively calls itself until the spinning wheel has exactly 5 unique values.



