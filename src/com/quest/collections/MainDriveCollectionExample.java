package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MainDriveCollectionExample {
    public static void main(String[] args) {
        CollectionExample collection;
        ArrayList<CollectionExample> collectionExamples = new ArrayList<>();
        collectionExamples.add(new CollectionExample("Hari", 21, "Thrissur"));
        collectionExamples.add(new CollectionExample("Divya", 19, "Ekm"));
        collectionExamples.add(new CollectionExample("Bhasker", 74, "Thrissur"));
        collectionExamples.add(new CollectionExample("Anoop", 30, "Kannur"));
        collectionExamples.add(new CollectionExample("Miya", 19, "Tvm"));


        System.out.println("Person with age less than 20 with iterator");
        Iterator<CollectionExample> iterator = collectionExamples.iterator();
        while (iterator.hasNext()) {
            collection = iterator.next();
            if (collection.getAge() < 20) {
                System.out.println(collection.getName());
            }
        }

        System.out.println("\nperson with age greaer than 70");
        for (CollectionExample person : collectionExamples) {
            if (person.getAge() >= 20) {
                System.out.println(person.getName());
            }
        }

    }
}
