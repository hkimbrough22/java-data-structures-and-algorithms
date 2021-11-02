package codechallenges.hashMap;

import codechallenges.Array;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;

    public HashMap(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("HashMap must have a size of 1 or greater");
        }
        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);
        for(int i = 0; i <this.size; i++){
            bucketArrayList.add(i, new LinkedList<>());
        }
    }

    public void add(K key, V value){
        int hashedKey = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashedKey);
        bucket.add(new HashMapPair<>(key, value));
    }

    public V get(K key){
        int hashedKey = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashedKey);
        for (HashMapPair<K, V> currentKey : bucket) {
            if(currentKey.getKey().equals(key)) {
                return currentKey.getValue();
            }
        }
        return null;
    }

    public boolean contains(K key){
        int hashedKey = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashedKey);
        for (HashMapPair<K, V> currentKey : bucket) {
            if(currentKey.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public int hash(K key){
        return Math.abs(key.hashCode() % size);
    }

    public static String repeatedWords2(String string) {
        String[] wordsArray = string.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        int size = wordsArray.length * 2;
        HashMap<String, Boolean> newHashMap = new HashMap<>(size);
        for (String word : wordsArray) {
            if (newHashMap.contains(word)) {
                return word;
            }
            newHashMap.add(word.toLowerCase(), true);
        }
        return null;
    }
}
