package com.softserve.ita.taskstesting;

import java.io.BufferedReader;
import java.io.IOException;

public interface Task<R, T> {

    void setUp(BufferedReader reader) throws IOException;

    void setUp(T value) throws IOException;

    R execute();

}
