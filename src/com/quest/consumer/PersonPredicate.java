package com.quest.consumer;

import java.util.function.Predicate;

public interface PersonPredicate extends Predicate<Person> {
    boolean test(Person person);
}
