import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
     //1
      /*  String inputString = "Java is great and Java is powerful";

        String lowerCaseString = inputString.toLowerCase();
        String[] words = lowerCaseString.split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        } */


        //2
        /*
        String input = " My favourite movie is Lord of the ring ";
        String[] words = input.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(" Longest Word : " + longestWord); */

      //3
       /* String text = "The best superhero universe is Marvel";
        int vowelCount = 0;
        int consonantCount = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println(" Vowel Count: " + vowelCount);
        System.out.println(" Consonant Count: " + consonantCount); */

        //4

       /* String input = "A man a plan a canal Panama";

        String cleanedString = input.replaceAll("\\s", "").toLowerCase();
        boolean isPalindrome = true;

        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        } */

        //5
      /*  String mainString = "The best movie in the world is Lord of the ring .";
        String subString = "world";
        int index = findSubstring(mainString, subString);

        if (index != -1) {
            System.out.println("Подстрока найдена на позиции: " + index);
        } else {
            System.out.println("Подстрока не найдена.");
        }
    }

    public static int findSubstring(String mainString, String subString) {
        if (mainString == null || subString == null || subString.length() > mainString.length()) {
            return -1;
        }
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            boolean found = true;

            for (int j = 0; j < subString.length(); j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i;
            }
        }
        return -1; */



        //6
    /*    int[] numbers = {5, 10, 25, 15, 30, 35, 55};
        System.out.println("Массив до сортировки:");
        printArray(numbers);
        bubbleSort(numbers);
        System.out.println("\nМассив после сортировки:");
        printArray(numbers);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); */


        //7
       /* String s = "a1b9c3d5";
        int totalSum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    totalSum += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }

        if (currentNumber.length() > 0) {
            totalSum += Integer.parseInt(currentNumber.toString());
        }
        System.out.println("Исходная строка: " + s);
        System.out.println("Сумма всех чисел: " + totalSum); */



        //8

            /*
                int[] numbers = {1, 2, 5, 2, 7, 8, 5, 9, 1};

                Set<Integer> seen = new HashSet<>();
                Set<Integer> duplicates = new HashSet<>();

                for (int number : numbers) {

                    if (!seen.add(number)) {

                        duplicates.add(number);
                    }
                }

                System.out.println("Повторяющиеся элементы:");
                if (duplicates.isEmpty()) {
                    System.out.println("Нет дубликатов.");
                } else {
                    System.out.println(duplicates);
                }

             */


        //9

      /*  String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("'" + s1 + "' и '" + s2 + "' являются анаграммами.");
        } else {
            System.out.println("'" + s1 + "' и '" + s2 + "' не являются анаграммами.");
        }


        String s3 = " movie";
        String s4 = " eivom";

        if (areAnagrams(s3, s4)) {
            System.out.println("'" + s3 + "' и '" + s4 + "' являются анаграммами.");
        } else {
            System.out.println("'" + s3 + "' и '" + s4 + "' не являются анаграммами.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }


        String cleanedStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("\\s", "").toLowerCase();


        char[] array1 = cleanedStr1.toCharArray();
        char[] array2 = cleanedStr2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2); */

        //10


/*
        String originalString = "  Hello  \t world \n This is a test.   ";
        String resultString = originalString.replaceAll("\\s", "");

        System.out.println("Исходная строка: '" + originalString + "'");
        System.out.println("Строка без пробелов: '" + resultString + "'");

 */


        //11
/*
        String input = "Hello world";
        String cleanedString = input.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : cleanedString.toCharArray()) {
            int count = frequencyMap.getOrDefault(ch, 0);

            frequencyMap.put(ch, count + 1);
        }
        System.out.println("Частота символов:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } */

        //12
/*
        int n = 10;
        if (n <= 0) {
            return;
        }

        int a = 0;
        int b = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");

        System.out.print(a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
 */


               //13
        /*
        int n = 20;

        System.out.println("Простые числа от 2 до " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

         */

        //14

    /*    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        System.out.println("Исходный массив:");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Сумма элементов на четных индексах: " + sum);

     */

        //15
/*
        int[] numbers = {4, 1, 9, 3, 7, 5, 2, 8, 6};

        System.out.println("Массив до обмена:");
        printArray(numbers);

        int minIdx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIdx]) {
                minIdx = i;
            }
        }

        int maxIdx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIdx]) {
                maxIdx = i;
            }
        }

        int temp = numbers[minIdx];
        numbers[minIdx] = numbers[maxIdx];
        numbers[maxIdx] = temp;

        System.out.println("\nМассив после обмена:");
        printArray(numbers);
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");

 */



    //16
/*
        String originalString = "hello world";
        StringBuilder reversedString = new StringBuilder();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString.append(originalString.charAt(i));
        }

        String result = reversedString.toString();

        System.out.println("Исходная строка: " + originalString);
        System.out.println("Перевернутая строка: " + result);

 */

        //17

  /*
        Integer[] numbers = {1, 5, 2, 8, 5, 1, 9, 2};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(numbers));
        Integer[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("\nМассив без дубликатов:");
        System.out.println(Arrays.toString(uniqueNumbers));
    }

    public static Integer[] removeDuplicates(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(arr));
        return uniqueSet.toArray(new Integer[0]);

   */


        //18
/*
        int[] numbers = {10, 5, 20, 8, 20, 15};
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Второе по величине число: " + secondLargest);
        } else {
            System.out.println("Невозможно найти второе по величине число.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return secondLargest;

 */


        //19
/*
        Integer[] array1 = {1, 2, 5, 8, 9};
        Integer[] array2 = {2, 5, 10, 15};

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        List<Integer> mergedList = mergeArraysAndRemoveDuplicates(array1, array2);

        System.out.println("\nОбъединенный массив без дубликатов: " + mergedList);
    }

    public static List<Integer> mergeArraysAndRemoveDuplicates(Integer[] arr1, Integer[] arr2) {
        Set<Integer> uniqueSet = new HashSet<>();

        uniqueSet.addAll(Arrays.asList(arr1));
        uniqueSet.addAll(Arrays.asList(arr2));
        return new ArrayList<>(uniqueSet);

 */


        //20


     /*   String mainString = "apple,banana,cherry,orange";
        char delimiter = ',';

        List<String> parts = splitByChar(mainString, delimiter);

        System.out.println("Исходная строка: \"" + mainString + "\"");
        System.out.println("Результат разбиения: " + parts);
    }

    public static List<String> splitByChar(String str, char delimiter) {
        List<String> result = new ArrayList<>();
        StringBuilder currentPart = new StringBuilder();
        if (str == null || str.isEmpty()) {
            result.add("");
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == delimiter) {
                result.add(currentPart.toString());
                currentPart.setLength(0);
            } else {
                currentPart.append(ch);
            }
        }
        result.add(currentPart.toString());
        return result; */

   /*     public int sum(int n){
  
   if(n == 1){
      return 1;
   }
  
   return n + sum(n-1);
} */

    /*     Tester tester = new Tester();
      int result = tester.sum(5);
      System.out.println("Sum: " + result);
   }

   public int sum(int n){
      System.out.println("Input: " + n);
      int result;
     
      if(n == 1){
         result = 1;
         System.out.println("Base condition fulfilled.");
      }else {  */



     /*   Tester tester = new Tester();
    
      int result = tester.fact(5);
      System.out.println("Factorial: " + result);
   }
  
   public int fact(int n) {
     
      return n == 1 ? 1: n * fact(n-1); */
        
    }

}
