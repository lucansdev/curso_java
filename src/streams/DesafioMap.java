package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Function<Integer,String> stringToBi = n -> Integer.toBinaryString(n);
        UnaryOperator<String> reverseString = s -> {
            String newString = "";
            for ( int i= s.length() - 1; i >= 0 ; i--){
                newString += s.charAt(i);
            }
            return newString;
        };
        Function<String,Integer> otherNumber = valor -> Integer.parseInt(valor,2);

        nums.stream().map(stringToBi).map(reverseString).map(otherNumber).forEach(System.out::println);


    }
}
