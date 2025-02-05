package org.exercise_one.util;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StdoutReader {

    private ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    private PrintStream defaultPrintStream = System.out; // the default stream
    private PrintStream customOutputStream = new PrintStream(byteArrayOutputStream);

    /**
     * Captures our stdout which we can then use for testing
     */
    public void readStdOutput(){
        setCustomOutputStream();
    }

    /**
     * Returns the captured data in the form of a string
     * @return String
     */
    public  String getText(){
        resetStdOutputStream();
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8);
    }

    private void setCustomOutputStream(){
        System.setOut(customOutputStream);
    }

    /**
     * Flushes the Outputstream and returns our original stream
     */
    public void resetStdOutputStream(){
        System.out.flush();
        System.setOut(defaultPrintStream);
    }


}
