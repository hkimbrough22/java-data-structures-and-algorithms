# Blog
## Insertion-Sort Pseudocode
```aidl
InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```
#### First Pass
Starting Array = `[8,4,23,42,16,15]`

- On the first pass of the code, we look to see if the second value of the array is smaller than the first, which it is. The value of the second index is first saved in `temp` so that it can be assigned to its new position in the array while the first index's value replaces the second index's value. After this is done, the value of the first index is re-written as `temp`'s value.

- `i = 1`
- `j = 0`
- `temp = 4`
- `arr[j] = 8`
- Since `0 >= 0` AND `4 < 8` then
  - `arr[1] = 8`
  - `j = -1`, while loop breaks
- `arr[0] = 4`

#### Second Pass
Current Array = `[4,8,23,42,16,15]`

- On the second pass of the code, we look to see if the third value of the array is smaller than the second, which it is not. The code does not enter the while loop since 23 is not smaller than 8, and the next iteration begins.
- `i = 2`
- `j = 1`
- `temp = 23`
- `arr[j] = 8`

- Since `1 >= 0` BUT `23 !< 8` then
  - while loop breaks
- `arr[2] = 23` (nothing changes)

#### Third Pass
Current Array = `[4,8,23,42,16,15]`

- On the third pass of the code, the same thing happens as prior. 42 is not less than 23 so nothing happens and the next iteration begins.

- `i = 3`
- `j = 2`
- `temp = 42`
- `arr[j] = 23`

- Since `2 >= 0` BUT `42 !< 23` then
    - while loop breaks
- `arr[3] = 42` (nothing changes)

#### Fourth Pass
Current Array = `[4,8,23,42,16,15]`

- On the fourth pass of the code, we look to see if the fifth value of the array is smaller than the fourth, which it is. The value of the fifth index is first saved in `temp` so that it can be assigned to its new position in the array while the fourth index's value replaces the fifth index's value. After this is done, j is reduced by one, which allows us to now compare `temp` to the other sorted numbers of the array. If `temp` is still less than (as it is here), then that value is now assigned to an index that is one higher than it previously was. This repeats until `temp` is greater than an index of the array, which then assigns `temp` to the next index after.

- `i = 4`
- `j = 3`
- `temp = 16`
- `arr[j] = 42`

- Since `3 >= 0` AND `16 < 42` then
    - `arr[4] = 42`
    - `j = 2`
    - Since `2 >= 0` AND `16 < 23` then
      - `arr[3] = 23`
      - `j = 1`
      - Since `1 >=0` BUT `16 !< 8` then
        - while loop breaks
- `arr[2] = 16`

#### Fifth Pass
Current Array = `[4,8,16,23,42,15]`

- This pass is very similar to the last and moves 15 all the way down the same way it did 16 on the fourth pass.

- `i = 5`
- `j = 4`
- `temp = 15`
- `arr[j] = 42`

- Since `4 >= 0` AND `15 < 42` then
    - `arr[5] = 42`
    - `j = 3`
    - Since `3 >= 0` AND `15 < 23` then
        - `arr[4] = 23`
        - `j = 2`
        - Since `2 >=0` AND `15 < 16` then
          - `arr[3] = 16`
          - `j = 1`
          - Since `1 >= 0` BUT `15 !< 8` then
            - while loop breaks
- `arr[2] = 15`

### Final Array = `[4,8,15,16,23,42]`

