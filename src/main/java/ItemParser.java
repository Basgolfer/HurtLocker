import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.Collections;

public class ItemParser {
    private String outputRawDataString;
    private ArrayList<String> items;

    public ItemParser() {
        setOutputRawDataString();
    }


    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public void setOutputRawDataString() {
        try {
            this.outputRawDataString = readRawDataToString();
        } catch (Exception e) {
            System.out.println("Error reading from file. Please try again.");
        }
    }

    public String getOutputRawDataString() {
        return this.outputRawDataString;
    }

    public void putEachItemInStringArrayList() {
        String[] stringArray = this.outputRawDataString.split("##");
        Collections.addAll(this.items, stringArray);
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
