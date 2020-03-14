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
* The size of our input doesn't matter but the runtim complexity of the method
is what matters and in this case, this method will always run in constant time.

### 0(2)

```java
public void log(int[] numbers) {
    // O(1)
    System.out.println(numbers[0]);
    System.out.println(numbers[0]);
}
```

So what if we duplicate the operation?

* The duplicated operation will still be constant time. 
* The runtime complexity for performing both operations will be  `O(2)`.
* However, when we measure the runtime complexity of the operation whether its
duplicated or not, it'll be _Constant Time_ which will be represented as `O(1)`.