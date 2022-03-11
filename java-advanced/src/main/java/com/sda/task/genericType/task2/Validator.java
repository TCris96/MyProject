package com.sda.task.genericType.task2;

import java.util.ArrayList;

public interface Validator<T> {

    boolean validate(T value);


}
