# 

```java
public class LinearTimeExample {
    public void log(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```

* The size of this algorithm will grow relative to the size of the input.
* So we will represent the size of this algorithm as the big `0(n)` where
`n` represents the size of the input.
* So as `n` grows the complexity of the algorithm grows linearly.

## Other examples of 0(n)

```java
public class LinearTimeExample {
    public void log(int[] numbers) {
        
        System.out.println(); // O(1)

        // O(n) where n = input
        for(int number: numbers){
            System.out.println(number);
        }
        
        System.out.println(); // O(1)
    }
}
```

* The runtime complexity of this method is `O(1 + n + 1)`.
* This can be simplified to `O(2 + n)`.
* However when we use the Big O notation, we drop the constant because
it doesn't really matter.  For example, if our `for()` algorithm
has 1 million inputs, having two extra operations is not going to have a significant
impact on the complexity of the algorithm. 
* The cost of our algorithm will still increase linearly so we simplify this by
dropping the constant thus making the Big O notation of the algorithm above as 
`O(n)`.

