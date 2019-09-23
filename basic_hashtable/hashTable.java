import java.util.*;
import java.io.*;

class HashTableClass {
    public static void main(String[] args) {
        System.out.println("============Starting Basic implementation============");

        /* Create a hashTable */
        Hashtable hashtable = new Hashtable();

        /* Insert Values */
        hashtable.put("key1", "value 1");
        hashtable.put("key3", "value 3");
        hashtable.put("key4", "value 4");
        hashtable.put("key9", "value 9");

        /* Checking existance of value / key */
        System.out.println(hashtable.containsKey("key1"));
        System.out.println(hashtable.containsKey("key2"));
        System.out.println(hashtable.containsValue("value1"));
        System.out.println(hashtable.containsValue("value 1"));

        /* Iterating over elements */
        Enumeration em = hashtable.elements();
        while (em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
    }
}