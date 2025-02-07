
# 🔢 Java Data Types, Type Conversion & Type Casting  





## 📌 Overview  
_Java is a **statically-typed** language, meaning every variable must have a defined data type. Data types define the type and size of data a variable can store._  

### **Java supports:**

_✅ **Primitive Data Types** (Basic types)  
✅ **Non-Primitive Data Types** (Reference types like objects, arrays, and strings)  
✅ **Type Conversion & Type Casting** (Converting one data type to another)_



## 1️⃣ Java Data Types  

### 🔹 Primitive Data Types (Built-in)  

_Java has **8 primitive data types**:  

| Data Type | Size | Default Value | Description |
|-----------|------|--------------|-------------|
| `byte`    | 1 byte  | `0`         | Stores small integers (-128 to 127) |
| `short`   | 2 bytes | `0`         | Stores larger integers (-32,768 to 32,767) |
| `int`     | 4 bytes | `0`         | Stores whole numbers (-2^31 to 2^31-1) |
| `long`    | 8 bytes | `0L`        | Stores very large whole numbers (-2^63 to 2^63-1) |
| `float`   | 4 bytes | `0.0f`      | Stores decimal numbers (6-7 decimal digits) |
| `double`  | 8 bytes | `0.0d`      | Stores precise decimal numbers (15-16 decimal digits) |
| `char`    | 2 bytes | `\u0000`    | Stores a single character ('A', 'b', etc.) |
| `boolean` | 1 bit  | `false`     | Stores `true` or `false` values |_


### 🔹 Non-Primitive Data Types (Reference Types)

 _Non-primitive types are more complex data structures and include:_

_String (sequence of characters)
_Arrays (collection of elements)
_Classes & Objects
Interfaces_

### 2️⃣ Type Conversion in Java
_Type conversion is the process of converting data from one type to another._

🔹 Implicit Type Conversion (Widening)
_Happens automatically when a smaller data type is converted into a larger one._



### 3️⃣ Type Casting in Java
_Type casting forces a variable to be converted into another type.
🔹 Widening Casting (Automatic) Converts a smaller type to a larger type.Safe, no data loss.
🔹 String to Numeric Conversion
  We can convert a String to a number using wrapper classes like **Integer.parseInt()**, **Double.parseDouble()**, etc._

### 🏆 Best Practices
_✅ Use widening conversions whenever possible to avoid data loss.
✅ Be careful with narrowing conversions (may lose precision).
✅ Use wrapper classes (Integer.parseInt(), Double.parseDouble()) for string conversion.
✅ Check for possible exceptions (NumberFormatException when converting strings to numbers)._

### 📢 Conclusion

_Understanding data types, type conversion, and type casting is essential in Java programming. Correct usage ensures efficient memory usage and prevents errors._




### Follow me on Linkedin:- _https://www.linkedin.com/in/bhanuprakashkurugodu/_



### _🚀Happy Coding! 🎯_

