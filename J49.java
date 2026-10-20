//Hash map and Hash set via collections


public class J49{
    public static void main(String[] args) {
        
    }
}
// =====================================================
// HASHMAP: stores key-value pairs
// =====================================================
// - Keys are unique. Values can repeat.
// - put/get/containsKey/remove are O(1) on average.
// - Order of elements is NOT guaranteed.
// - Use wrapper types: HashMap<Integer, Integer>, not <int, int>.

// ----- Main functions -----
// 1. put(k, v)           : add a pair, or replace the value if the key exists
// 2. get(k)              : returns the value, or null if the key is absent
// 3. containsKey(k)      : true or false
// 4. getOrDefault(k, d)  : value if present, else d (avoids the null problem)
// 5. putIfAbsent(k, v)   : adds only if the key is not there yet
// 6. remove(k)           : deletes the pair
// 7. size(), isEmpty(), clear()
// 8. keySet()            : all keys, used for looping
// 9. entrySet()          : keys and values together (faster than get() inside a keySet loop)
// 10. values()           : all values
//     containsValue(v)   : O(n), avoid it inside loops


// =====================================================
// HASHSET: stores unique single values
// =====================================================
// - No duplicates allowed.
// - add/contains/remove are O(1) on average.
// - No index, so there is no get(0). Use a for-each loop.
// - Order of elements is NOT guaranteed.

// ----- Main functions -----
// 1. add(x)        : returns true if added, false if already present
// 2. contains(x)   : true or false
// 3. remove(x)     : deletes the value
// 4. size()        : number of elements
// 5. isEmpty()     : true or false
// 6. clear()       : removes everything


// =====================================================
// WHICH ONE TO USE
// =====================================================
// "Is there a duplicate?"            -> HashSet, use the add() return value
// "Count occurrences"                -> HashMap, getOrDefault + put
// "Find a pair that sums to target"  -> HashMap (value -> index)
// "Unique elements only"             -> HashSet, new HashSet<>(list)
// "Common elements of two arrays"    -> HashSet, retainAll


// =====================================================
// COMMON MISTAKES
// =====================================================
// 1. HashSet<int>                     -> compile error, use HashSet<Integer>
// 2. int v = map.get(k) on a missing key -> get returns null and the program
//    crashes, so use getOrDefault(k, 0)
// 3. map.get(k) + 1 on a missing key  -> same crash, use getOrDefault
// 4. set.get(0)                       -> sets have no index, use for-each
// 5. containsValue inside a loop      -> O(n) each time, loop becomes O(n^2)
// 6. Expecting addAll/retainAll/removeAll to return a new set
//    -> they modify the original, copy first
// 7. Expecting printed order to match insertion order

// =====================================================
// MEMORIZE FIRST
// =====================================================
// HashMap: put, get, containsKey, getOrDefault
// HashSet: add, contains, remove
