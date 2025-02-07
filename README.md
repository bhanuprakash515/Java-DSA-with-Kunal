# Kunal Kushwaha DSA

### **What is Programming**:
_Programming is the process of writing instructions for a computer to follow. These instructions are called code and are written in a programming language_

### **What is Java?**

_Java is a programming language and computing platform that's used to create applications, operating systems, and other software. It's a popular choice for developers because it's fast, secure, and reliable._ 

### **What Java is used for?**
_**Mobile apps**: Java is used to create apps for mobile devices, especially Android. 
**Enterprise software**: Java is used to create software for businesses. 
**Web applications**: Java is used to create web applications and web servers.
**Big data applications**: Java is used to create applications that work with big data. 
_


### **DataTypes In Java**

### Primitive Data Types:
_The Data Type that cannot be Breakable is called Primitive Daya Type._

### **Examples you can see in the below Image:-
**
![image](https://github.com/user-attachments/assets/74159c1c-4c93-46ca-8e6c-46b25c6d975f)


### Non Primitive Data Types:
_The Data Type that can be Breakable is called Primitive Daya Type._

### Examples:
![image](https://github.com/user-attachments/assets/29fbbb24-2b61-4973-b1fe-c5aab568fa89)

# 🚀 Java Conditional Statements

## 📌 Overview
Conditional statements in Java allow the execution of different code blocks based on specific conditions. These statements help in decision-making and control the flow of a Java program.

### 🔹 Types of Conditional Statements:
1. `if` Statement
2. `if-else` Statement
3. `else-if` Ladder
4. `switch` Statement
5. Ternary Operator (`?:`)

---

## 1️⃣ If Statement
The `if` statement checks a condition and executes a block of code only if the condition is `true`.

✅ **Syntax:**
```java
if (condition) {
    // Code to execute if condition is true
}



2️⃣ If-Else Statement
The if-else statement executes one block if the condition is true and another if it is false.


✅ Example:

java
Copy
Edit
int number = 10;
if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
🔹 Real-world use case:
Login validation - If the username and password match, allow access; otherwise, show an error.


3️⃣ Else-If Ladder
Used when there are multiple conditions to check sequentially.

✅ Example:

java
Copy
Edit
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: D");
}
🔹 Real-world use case:
Determining tax brackets based on income.


4️⃣ Switch Statement
Used when a variable needs to be compared against multiple fixed values.

✅ Syntax:

java
Copy
Edit
switch (expression) {
    case value1:
        // Code block
        break;
    case value2:
        // Code block
        break;
    default:
        // Code block if no case matches
}




