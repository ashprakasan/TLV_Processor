package com.aiswarya.UnitTest;

import com.aiswarya.Main;
import org.junit.Assert;

import org.junit.Test;
/**
 * Created by ashprakasan on 03/12/17.
 * Unit Tests
 */
public class Test_TLV_Processor {
    @Test
    public void testProcessMultipleTypesInOneLine(){
        String input = "UPPRCS-0008-AbcdefghREPLCE-0003-123REPLCE-0001-Z";
        String expected = "UPPRCS-ABCDEFGH\n" +
            "REPLCE-THIS STRING\n" +
            "REPLCE-THIS STRING";
        Assert.assertEquals(expected, Main.process(input));
    }

    @Test
    public void testProcessInvalidType(){
        String input = "TAG001-0012-abcdefgh1234";
        Assert.assertEquals("Type not valid",Main.process(input));
    }

}
