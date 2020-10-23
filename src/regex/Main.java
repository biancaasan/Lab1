package regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("[a-zA-Z0-9]" + "[a-zA-Z0-9_.]" + "*@[a-zA-Z0-9]" + "+([.][a-zA-Z]+)+");
        BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\Bianca\\IdeaProjects\\Lab1\\src\\regex\\email"));
        Regex r = new Regex();
        r.extractEmailsFromFile(buff,p);
    }
}
