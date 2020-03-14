# Constant Time

```java
public void log(int[] numbers) {
    System.out.println(numbers[0]);
}
```

* This method prints a number to the console.
* It doesn't matter how big the array is. It could even 
have 1 million elements but all you're doing here is 
printing te first element/item in the array.
* So this method has __a single operation__ and takes a __constant__ amount of 
time to run.

## The Big O Notation representation?

```java
public void log(int[] numbers) {
    // O(1)
    System.out.println(numbers[0]);
}
```

* So in _Big O_ notation terms, this method has a single operation which takes 
_constant time_ and that is represented as `O(1)`.