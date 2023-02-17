# Pre Knowledge before you start this project

## Function

### Create a Method

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

#### Example Explained

- `myMethod()` is the name of the method.
- `static` means that the method belongs to the Main class and not an object of the Main class. 
- `void` means that this method does not have a return value. 

### Calling a method 

To call a method in Java, write the method's name followed by two parentheses () and a semicolon;

In the following example, `myMethod()` is used to print a text (the action), when it is called:

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```

## Recursion 

The process in which a `function` calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function. 

- Direct recursion:

```java
void directRecFun()
{
    // Some code....

    directRecFun();

    // Some code...
}
```

- Indirect recursion:

```java
void indirectRecFun1()
{
    // Some code...

    indirectRecFun2();

    // Some code...
}

void indirectRecFun2()
{
    // Some code...

    indirectRecFun1();

    // Some code...
}
```

***What is difference between tailed and non-tailed recursion?*** A recursive function is tail recursive when recursive call is the last thing executed by the function. Please refer tail [recursion article](https://www.geeksforgeeks.org/tail-recursion/) for details. How memory is allocated to different function calls in recursion? When any function is called from main(), the memory is allocated to it on the stack. A recursive function calls itself, the memory for the called function is allocated on top of memory allocated to calling function and different copy of local variables is created for each function call. When the base case is reached, the function returns its value to the function by whom it is called and memory is de-allocated and the process continues. Let us take the example of how recursion works by taking a simple function.

```java
// A Java program to demonstrate
// working of recursion

class Example {
	static void printFun(int test)
	{
		if (test < 1)
			return;

		else {
			System.out.printf("%d ", test);

			// Statement 2
			printFun(test - 1);

			System.out.printf("%d ", test);
			return;
		}
	}

	public static void main(String[] args)
	{
		int test = 3;
		printFun(test);
	}
}
```

Output:

```
3 2 1 1 2 3 
```
