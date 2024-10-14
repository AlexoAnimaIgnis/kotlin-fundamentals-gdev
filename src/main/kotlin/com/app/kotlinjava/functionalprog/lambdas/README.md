# Lambdas

### Lambdas Syntax
Lambda always goes in curly braces. The syntax is composed of
1. parameters
2. arrow symbol
3. body


```kotlin
{ x: Int, y: Int -> x + y }

// if you use lambda as an argument, you can put it inside the parameter
list.any({ x: Int, y: Int -> x + y })
```

However, there is a btter way to express it. When lambda is the last argument , it can be moved out

```kotlin
list.any() { x: Int, y: Int -> x + y }
```

If the Lambda is the last argument, and if the parentheses are empty, you can omit them
```kotlin
list.any { x: Int, y: Int -> x + y }
```
