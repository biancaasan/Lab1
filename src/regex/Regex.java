package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void extractEmailsFromFile(BufferedReader buff, Pattern p) throws IOException {
        String line = buff.readLine();
        while(line != null){
            Matcher m = p.matcher(line);

            while(m.find()){
                System.out.println("Adresa de email gasita e: " + m.group());
            }
            line = buff.readLine();
        }
    }

}
