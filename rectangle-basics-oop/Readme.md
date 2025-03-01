**Submission: TP03 - Creating a Rectangle Class using OOP**  
==========================================================  

# Author: Yousra CHBIB  
In this exercise, we focus on building a `Rectangle` class while following given guidelines.  

### First Step:  
In my OOP repository, I created a folder named `tp3`. Inside this folder, I created another one called **`src`**, where I store all the Java classes.  

### Second Step:  
I created a `Rectangle` class with two private attributes: `length` and `width`. Then, I implemented a constructor that takes these two parameters.  
Next, I added methods to access the attributes: **`getLength()`** to retrieve the length and **`getWidth()`** to retrieve the width.  
Additionally, I implemented:  
- **`calculateArea()`** to compute the area,  
- **`calculatePerimeter()`** to compute the perimeter,  
- **`isSquare()`** to check whether the rectangle is a square,  
- **`equals()`** to compare two rectangles,  
- **`toString()`** to return a string representation of the rectangle.  

You will also find a UML diagram representation of the `Rectangle` class.  

#### **Rectangle Class UML Diagram:**  

| Rectangle |  
|-----------|  
| - length: double |  
| - width: double |  
|-----------|  
| + Rectangle(length: double, width: double) |  
| + getLength(): double |  
| + getWidth(): double |  
| + calculateArea(): double |  
| + calculatePerimeter(): double |  
| + isSquare(): boolean |  
| + equals(obj: Object): boolean |  
| + toString(): String |  

### Third Step:  
I created a `RectangleMain` class with the method signature **`public static void main(String[] args) {}`** to test the `Rectangle` class.  
Inside this method, I created two objects (**`rectangle1`** and **`rectangle2`**). The first rectangle takes random values as parameters (either predefined or generated using `java.util.Random`). The second rectangle takes user-defined values passed as command-line arguments.  

### Fourth Step:  
To compile and run the project:  
- First, compile both classes using the following command inside `poo/tp3`:  
  ```bash
  javac -sourcepath src src/*.java -d classes
