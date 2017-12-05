package com.aiswarya;
public class Utility {
     static String extractString(String line, int start, int end){
        StringBuilder sb = new StringBuilder();
        char[] inp = line.toCharArray();
        for(int i = start;i<end;i++){
            sb.append(inp[i]);
        }
        return sb.toString();
    }
}
