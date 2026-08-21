// Hashing Theory
// Hashing is a technique used to store and retrieve data efficiently.
// It maps data (keys) to a fixed-size array using a hash function, which allows fast access.
// The main idea is:
// ● Convert a value into an index using a hash function
// ● Store the value at that index
// ● Retrieve it in constant time
// Hashing is mainly used for frequency counting, searching, and lookup operations.
// Example
// Array: [1, 2, 2, 3, 1]
// We want to know how many times each number appears.
// Using hashing:
// ● 1 → 2 times
// ● 2 → 2 times
// ● 3 → 1 time

package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {

    public static void main(String[] args) {

        String text ="programming";

        Map<Character,Integer> freqMap=new HashMap<>();

        for(char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            System.out.println("'"+entry.getKey() + "' appears " +entry.getValue()+ " times");
        }
        
    }
    
}
