package org.exercise_one.util;

import java.io.*;

public class captureOutputStream {

    private ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    private PrintStream defaultPrintStream = System.out; // the default stream
    private PrintStream customOutputStream = new PrintStream(byteArrayOutputStream);


    /**
     * Captures our stdout which we can then use for testing
     */
    public void capture(){
        setNewOutputStream();
    }

    /**
     * Returns the captured data in the form of a string
     * @return String
     */
    public  String getText(){
        resetPrintStream();
        return byteArrayOutputStream.toString().trim();
    }
    private void setNewOutputStream(){
        System.setOut(customOutputStream);
    }

    /**
     * Flushes the Outputstream and returns our original stream
     */
    public void resetPrintStream(){
        System.out.flush();
        System.setOut(defaultPrintStream);
    }


}
