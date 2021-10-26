# Library
## Insertion Sort
- Write a blog post walking through the given pseudocode as though you have written a function for it. Step through and identify key items.
- [Blogpost](./BLOG.md)

### Pseudocode
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



  [Back to Original README](../../README.md)