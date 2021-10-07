# Library
## Stack-Queue-Brackets
### Validate Brackets
- Determine whether the brackets in the string are balanced
- Arguments: string
- Return: boolean

- There are 3 types of brackets:
1. Round Brackets : `()`
2. Square Brackets : `[]`
3. Curly Brackets : `{}`

#### Example:
```java
Input                   Output
{}	                TRUE
{}(){}	                TRUE
()[[Extra Characters]]	TRUE
(){}[[]]	        TRUE
{}{Code}[Fellows](())	TRUE
[({}]	                FALSE
(](	                FALSE
{(})	                FALSE
```

  [Back to Original README](../../README.md)