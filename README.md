Before starting this project sure to check [preKnowledge](https://github.com/dakshdeepHERE/SpinWheel-Game/blob/main/src/PreKnowledge.md) file. 

# SpinWheel-Game

In this project I was suppose to use my knowledge of `recursion` and create a Java game using `recursion`. The game includes three `recursive` stages `Generate Spinning Wheel`, `Spin the Wheel`, and `Play the Game`. The game starts by generating five unique random numbers between 0 and 299 inclusive (no duplications). The five generated numbers represent the spinning wheel sectors. The second stage of the game is `Spin the Wheel`. In this stage, the program generates a random number between 1 and 5 inclusive, representing the wheel sector. Based on the sector number, the value will be the `Play the Game` stage parameter.

The program should include at least the following methods:

1. Generate Spinning Wheel, a recursive method that generates five unique random numbers between 0 and 500 inclusive (no duplications) to represent the spinning wheel sectors. 

2. Spin the Wheel is a method that generates a random number between 1 and 5 inclusive and returns the corresponding value of the wheel sector. 

3. Play the Game is a method that accepts one parameter, which is the selected wheel sector value returned from the Spin the Wheel method. The function calls one of three recursive methods based on the wheel sector value. If the value is between 1 and 99 inclusive, the first method print a hailstone sequence is called with the wheel value as an argument. If the value is between 100 and 199 inclusive, the second method **display all odd numbers** is called with the sector value and 200 as arguments. If the wheel sector value is between 200 and 299, the third method **print modulus** is called with the wheel sector value and a generated random number between 2 and 10.
  - **print a hailstone sequence** recursive recursive method is to generate a hailstone sequence of numbers. 
    - The sequence starts with a positive integer n accepted as a parameter and always ends with one by following the rules below :-
    - If n is 1, then the sequ.ence ends.
    - If n is an even number, then the next number in the sequence is n/2
    - If n is an odd number,then the next number in the sequence is (3*n)+1
  - **display all odd numbers** recursive method accepts the wheel sector value as a parameter and prints all the odd numbers between the parameter value and 200.
  - **print modulus** recursive method accepts the wheel sector value and a generated random integer between 2 and 10 as parameters. The function calculates the parameters' modulus without using multiplication, division, modulus, or any other Java methods except addition and subtraction
  
4. Manage the program. You should divide your program into methods called by the main method and the other methods mentioned in the specifications to complete the game. The program should continue asking the player if they want to play the game again or not.
