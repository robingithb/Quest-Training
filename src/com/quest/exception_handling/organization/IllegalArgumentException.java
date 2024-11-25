package com.quest.exception_handling.organization;

import javax.management.RuntimeMBeanException;

public class IllegalArgumentException extends RuntimeMBeanException {
    public IllegalArgumentException(RuntimeException e, String message) {
        super(e, message);
    }
}
