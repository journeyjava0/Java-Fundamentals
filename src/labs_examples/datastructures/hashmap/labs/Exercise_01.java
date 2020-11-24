package labs_examples.datastructures.hashmap.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        person.put("Jim", 45);
        person.put("Bill", 30);
        person.put("Jane", 35);

        System.out.println(person.get("Jim")); //returns 45

        //use putAll();
        HashMap<String, Integer> copyPerson = new HashMap<>();
        copyPerson.putAll(person); //maps everything from person to copyPerson

        System.out.println("Size of hashmap is: " + person.size());
        if(person.containsKey("Jane")){
            System.out.println("Key 'Jane' contained in hashmap");

        //keySet returns the keys in the current hashmap
        System.out.println(person.keySet());

        //entrySet returns the key value pairs
        System.out.println(person.entrySet());

        //putIfAbsent ... if the key isn't already assigned a value or assigned null, then add this value to it
        //as long as the key isn't already in the hashmap
        person.putIfAbsent("Bob", 50);
        System.out.println(person.get("Bob")); //returns 50?

        person.remove("Jane");
        System.out.println(person.entrySet());

        //replace just changes the value for a given key to a new value
        person.replace("Bob", 50, 65);
        System.out.println(person.get("Bob"));

        person.forEach((K, V) -> {
            System.out.format("key: " + K + "'s age: " + "value: " + V + " years old ", K, V);
        });
        }

        System.out.println(" ");
        person.clear();
        System.out.println(person.entrySet()); //returns null
        System.out.println(copyPerson.entrySet()); //made a copy previously
    }
}
