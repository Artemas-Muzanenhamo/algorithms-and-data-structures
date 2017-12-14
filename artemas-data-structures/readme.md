# Data Structures

## Abstract Data Type

An Abstract Data Type describes the type of data, the properties of the data
and it describes what operations you can perform with the data. It does not talk about
how to perform these operations or how to implement these operations or how to implement
the properties of this data. That is only done by Data Structures.

- Model of a data type
- Describes
    - Properties
    - Operations
- Theoretical concept
- Implemented by Data Structures.

### Example - Integer

... -3, -2, -1, 0, 1, 2, 3 ...

We said that an Abstract Data type describes the properties and the operations of that type of data.
So how do we describe an integer?

#### Describe

- Positive or Negative numbers

#### Operations

- Add
- Subtraction
- Multiplication
- Division (constraint - cannot divide by 0)

Abstract Data Type can also specify the constraint. In this case the constraint is that 
we cannot divide by 0.

## Data Structure

It is an implementation of an Abstract Data Type.

- Way of organising data.
- For efficient use.

### Array

{5, 7, 1, 6, 0} - Array
[0, 1, 2, 3, 4] - Index

- Implements the Array ADT.
- Continuous memory allocation.
- Index based access (a[0] = 5)

Based on the index, you can access an element inside an Array.

#### Describe

- A container object that holds a fixed number of values of a single type. 
- The length of an array is established when the array is created. After creation, 
its length is fixed.

#### Operations

- Searching (Binary Search)
- Sorting (Bubble Sort)