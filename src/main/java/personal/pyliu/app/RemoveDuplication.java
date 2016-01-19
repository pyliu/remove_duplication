package personal.pyliu.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Hello world!
 */
public class RemoveDuplication {
    public static void main(String[] args) {
        try {
            HashSet<String> set = new HashSet<String>();
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("corpus.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String line = null;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                counter++;
                set.add(line);
            }
            for (String s : set) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
