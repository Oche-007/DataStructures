## Algorithm for Checking Palindrome in Java

1. **Initialize Variables**:

   - Set `left` to 0.
   - Set `right` to the length of the word minus 1.

2. **Looping Condition**:

   - While `left` is less than `right`.

3. **Comparison**:

   - Compare character at index `left` with character at index `right`.
   - If not equal, return `false`.

4. **Move Indices**:

   - Increment `left` by 1.
   - Decrement `right` by 1.

5. **Completion**:

   - If loop completes, return `true`.

6. **Output**:
   - Call `isPalindrome` function with the word to check.
   - It Prints the result(`string` is palindrome or `string` is not palindrome).
