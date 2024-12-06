package com.quest.consumer;

import java.util.function.Supplier;

public interface PersonSupplier extends Supplier<Person> {
    @Override
    Person get();
}
