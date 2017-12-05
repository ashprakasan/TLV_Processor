package com.aiswarya;

public class Main {
    static final int TYPELENGTH = 6;
    static final int LENGTHLENGTH = 4;
    public static void main(String[] args) {
        Reader reader = new ScannerReader();
        while (reader.hasNext()) {
            System.out.println(process(reader.next()));
        }
    }

    /**
     * This is the method where TLV_processing is performed.
     * @param line each line from the input, which can have multiple Type-Length-Value.
     * @return : processed output that is to be displayed on sysout.
     */
    public static String process(String line) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while (c < line.length()) {
            if (c != 0)
                sb.append("\n");
            String typeName = Utility.extractString(line, c, c += TYPELENGTH);
            int l = Integer.parseInt(Utility.extractString(line, ++c, c += LENGTHLENGTH));
            String value = Utility.extractString(line, ++c, c += l);
            Type type = TypeFactory.createType(typeName);
            sb.append(type.process(value));
        }
        return sb.toString();
    }
}
