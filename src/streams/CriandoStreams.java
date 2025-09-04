package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("java ","Lua ", "JS\n");
        langs.forEach(print);

        String[] mainsLangs = {"python ","Lisp ","Perl ","Go\n"};

        Stream.of(mainsLangs).forEach(print);
        Arrays.stream(mainsLangs).forEach(print);



    }
}
