package UPDATE_18_02_2024;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Welcome {
    public static String greet(String language) {
        HashMap<String, String> myLang = new HashMap<>();
        String[] country = {"english", "czech", "danish", "dutch", "estonian", "finnish", "flemish", "french", "german", "irish", "italian", "latvian", "lithuanian", "polish", "spanish", "swedish", "welsh"};
        String[] greetings = {"Welcome", "Vitejte", "Velkomst", "Welkom", "Tere tulemast", "Tervetuloa", "Welgekomen", "Bienvenue", "Willkommen", "Failte", "Benvenuto", "Gaidits", "Laukiamas", "Witamy", "Bienvenido", "Valkommen", "Croeso"};

        int n = country.length;
        for (int i = 0; i < n; i++) {
            myLang.put(country[i], greetings[i]);
        }
        String result = "";
        if (myLang.containsKey(language)) {
            result = myLang.get(language);
        }
        else{
            result = "Welcome";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(greet("english"));
    }
}