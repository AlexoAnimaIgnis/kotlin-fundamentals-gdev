# Nullability

### Objectives
- Distinguish nullable types and non-nullable types 
- Use different ways to perform an action only when a value of a nullable type is not null 
- Prefer safe operations for nullable values 
- Employ functional programming style for manipulating collections 
- Use function types 
- Choose the right form of return expression for returning from lambda

### INTRO
The problem of nullability is sometimes referred to as a billion-dollar mistake. 
That's how Sir Tony Hoare the inventor of null reference, later called his invention. 
The problem is that these null point exceptions problems are really hard to fix and even if you go for details, 
you often can see just sorry null point exception was thrown. And the current approach, 
the modern approach which is not unique to cutting, is to convert these problems, these exceptions, from run-time, run-time exceptions, 
to compile-time errors, to make it compile time problems, 
so that we could prevent these exceptions when we write the code and compile it rather than later in production. 
Kotlin distinguishes nullable types and non-nullable types

