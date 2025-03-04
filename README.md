# Arrays in Java

## What are Arrays?
- Arrays are a non-primitive datatype in Java.
- Arrays are used to store multiple values in a single variable.
- They occupy contiguous memory allocations.
- Arrays are a **static data structure**, meaning we need to specify the size at the time of declaration.

### Example:
Suppose we want to store the ages of 40 students in a class. Instead of defining 40 separate variables, we can create a single array to store all the values.

## Ways to Create an Array:
1. **Static Initialization:**
   ```java
   int[] arr = {1, 2, 3, 4, 5};
   ```
2. **Dynamic Initialization:**
   ```java
   int arr[] = new int[size];
   ```
3. **Using new keyword with values:**
   ```java
   int[] arr = new int[]{1, 2, 3, 4, 5};
   ```

## Accessing Array Elements:
In Java, we access elements in an array using **indexing** (array index). Indexing always starts from **zero (0)**.

```java
int[] age = {24, 23, 18, 19, 20};
System.out.println("Age at first element is: " + age[0]);
System.out.println("Age at second element is: " + age[1]);
```

## Advantages of Arrays:
- **Easy Element Access (O(1))**: Elements are stored in contiguous memory, allowing fast access using an index.
- **Fixed Size Allocation**: Helps in avoiding memory fragmentation.

## When to Use Arrays:
- When you know the number of elements beforehand.
- When you need **fast random access (O(1))**.
- When **memory efficiency** is a priority (less overhead than linked lists).
- When all elements belong to the **same data type**.

## When NOT to Use Arrays:
- When the **size needs to be dynamic** (use `ArrayList`).
- When **frequent insertion/deletion** is required (use `LinkedList`).
- When **fast searching** is required (use `HashSet`).

# Multi-Dimensional Arrays in Java
- A **multi-dimensional array** is an array of arrays.
- Useful for storing tabular data (rows and columns).
- The simplest form is a **2D array**.

### Example of a 2D Array:
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

# Important Array Methods and Properties
Java provides utility methods through the `java.util.Arrays` class.

## 1. Sorting an Array (`Arrays.sort()`)
Sorts an array in ascending order.
```java
int[] numbers = {5, 2, 8, 1, 3};
Arrays.sort(numbers);
```

## 2. Binary Search (`Arrays.binarySearch()`)
Searches for an element and returns its index if found, otherwise returns a negative value.
```java
int[] arr = {1, 3, 5, 7, 9};
int index = Arrays.binarySearch(arr, 5);
```

## 3. Copying an Array (`Arrays.copyOf()` & `Arrays.copyOfRange()`)
```java
int[] original = {10, 20, 30, 40};
int[] copy = Arrays.copyOf(original, 6);
int[] rangeCopy = Arrays.copyOfRange(original, 1, 3);
```

## 4. Checking Array Equality (`Arrays.equals()`)
Compares two arrays element by element.
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2)); // Output: true
```

## 5. Filling an Array with a Value (`Arrays.fill()`)
Fills an array with a specified value.
```java
int[] arr = new int[5];
Arrays.fill(arr, 7);
```

## 6. Converting an Array to String (`Arrays.toString()`)
Converts an array into a human-readable string.
```java
int[] arr = {1, 2, 3, 4};
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4]
```

## 7. Working with Multi-Dimensional Arrays (`Arrays.deepToString()`)
Converts a multi-dimensional array into a readable string.
```java
int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
System.out.println(Arrays.deepToString(matrix));
// Output: [[1, 2, 3], [4, 5, 6]]
```

