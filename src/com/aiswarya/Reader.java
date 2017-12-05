package com.aiswarya;

/**
 * Created by ashprakasan on 03/12/17.
 * Interface to be implemented by any class that can take input for TLV_processing.
 * Different types of readers can be potentially implemented to  read from disk/network.
 */
public interface Reader {
    boolean hasNext();
    String next();
}
