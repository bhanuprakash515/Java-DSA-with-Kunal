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
✅ Example:

java
Copy
Edit
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
🔹 Real-world use case:
Checking if a user is old enough to access certain content.

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
✅ Example:

java
Copy
Edit
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
🔹 Real-world use case:
Creating a simple menu-driven program where the user selects an option.

5️⃣ Ternary Operator
A shorthand for if-else that reduces code complexity.

✅ Syntax:

java
Copy
Edit
variable = (condition) ? value_if_true : value_if_false;
✅ Example:

java
Copy
Edit
int a = 10, b = 20;
int min = (a < b) ? a : b;
System.out.println("Minimum value: " + min);
🔹 Real-world use case:
Setting a default value if a user input is missing.

🏆 Best Practices
✅ Always use curly braces {} for clarity, even in single-line conditions.
✅ Optimize performance by using switch instead of multiple if-else conditions when checking a single variable.
✅ Prefer the ternary operator for simple conditional assignments but avoid using it for complex logic.
✅ Ensure all conditions in an if-else or switch are well-defined to prevent unexpected behavior.

📢 Conclusion
Conditional statements are essential in Java for controlling the flow of a program based on conditions. Mastering them will make your code more efficient and readable.

🚀 Happy Coding!
