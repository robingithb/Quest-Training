package com.quest.consumer;

import java.util.function.Consumer;

public interface PersonConsumer extends Consumer<Person> {
    @Override
    void accept(Person person);
}
