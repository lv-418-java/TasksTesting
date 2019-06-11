package com.softserve.ita.taskstesting;

import java.io.BufferedReader;
import java.io.IOException;

public interface Task<R> {

    void setUp(BufferedReader reader) throws IOException;

    R execute();

}
