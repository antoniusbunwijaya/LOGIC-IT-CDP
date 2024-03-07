import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Antonius B W.
 * Running on OpenJDK 11
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Main for running this program
     */
    public static void main(String[] args) {
        runNumber1();
        spaceLine();
        runNumber2();
        spaceLine();
        runNumber3();
        spaceLine();
        runNumber4();
        spaceLine();
        runNumber5();
        spaceLine();
        runNumber6();
        spaceLine();
        runNumber7();

    }

    /**
     * to create double-spaced Lines
     */
    public static void spaceLine(){
        System.out.println();
        System.out.println();
    }

    /**
     * to running program number one
     */
    public static void runNumber1(){
        System.out.println("----------Awal Nomor 1---------");
        System.out.print("Masukan jumlah detik ");
        int inputSecond = scanner.nextInt();
        Time time = secondToConversion(inputSecond);
        String resultPrint1 = String.format(
                "Jumlah jam     : %d\n" +
                "Jumlah menit   : %d\n" +
                "Jumlah detik   : %d"
                ,time.hours, time.minutes, time.seconds );
        System.out.println(resultPrint1);
        System.out.print("Masukan jumlah jam : ");


        int inputHour2 = scanner.nextInt();
        System.out.print("Masukan jumlah menit : ");
        int inputMinute2 = scanner.nextInt();
        System.out.print("Masukan jumlah detik : ");
        int inputSecond2 = scanner.nextInt();
        int totalSecond2 = conversionToSecond(inputHour2, inputMinute2, inputSecond2);
        System.out.printf("Jumlah detik dari masukkan di atas adalah %d",totalSecond2);
        System.out.println(" ");
        System.out.println("----------Akhir Nomor 1---------");
    }

    /**
     * for conversion a second to Hours, Minute and Seconds.
     * @param totalSecond .
     * @return Time.
     */
    public static Time secondToConversion(int totalSecond){

        int hour = totalSecond / 3600;
        int remainingSecond = totalSecond % 3600;
        int minute = remainingSecond / 60;
        int second = remainingSecond % 60;

        return new Time(hour,minute,second);
    }

    /**
     * for conversion a second to Hours, Minute and Seconds.
     * @param inputHour .
     * @param inputMinute .
     * @param inputSecond .
     * @return int.
     */
    public static int conversionToSecond(int inputHour, int inputMinute, int inputSecond){


        int hourToSecond = inputHour*3600;
        int minuteToSecond = inputMinute*60;

        return hourToSecond + minuteToSecond + inputSecond;
    }


    /**
     * to running program number two
     */
    public static void runNumber2(){
        System.out.println("----------Awal Nomor 2---------");
        System.out.print("Masukan nilai faktorial : ");
        int inputNumber = scanner.nextInt();
        int result = factorialNumber(inputNumber);
        System.out.printf("Nilai desimalnya adalah %d",result);
        System.out.println(" ");
        System.out.println("----------Akhir Nomor 2---------");
    }

    /**
     * for create a factorial number.
     * @param number .
     * @return int.
     */
    public static int factorialNumber(int number){

        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialNumber(number - 1);
        }

    }

    /**
     * to running program number three
     */
    public static void runNumber3(){
        System.out.println("----------Awal Nomor 3---------");
        System.out.print("Masukan tahun : ");
        int inputYear = scanner.nextInt();
        boolean isLeap = isLeapYear(inputYear);
        if (isLeap){
            System.out.printf("Tahun %d merupakan tahun kabisat",inputYear);
        }else {
            System.out.printf("Tahun %d bukan tahun kabisat",inputYear);
        }

        System.out.println(" ");
        System.out.println("----------Akhir Nomor 3---------");
    }

    /**
     * for check year, is leap year or not.
     * @param year .
     * @return boolean.
     */
    public static boolean isLeapYear(int year){
        return year % 4 == 0;
    }

    /**
     * to running program number four
     */
    public static void runNumber4(){
        System.out.println("----------Awal Nomor 4---------");
        System.out.print("Masukan kata : ");
        String inputWord = scanner.next();
        scanner.nextLine();
        boolean isPalindrome = isPalindrome(inputWord);
        if (isPalindrome){
            System.out.printf("Kata '%s' merupakan palindrome",inputWord);
        }else {
            System.out.printf("kata '%s' bukan palindrome",inputWord);
        }

        System.out.println(" ");
        System.out.println("----------Akhir Nomor 4---------");
    }

    /**
     * for check a word, is leap year or not.
     * @param word .
     * @return boolean.
     */
    public static boolean isPalindrome(String word){

        word = word.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * to running program number five
     *
     */
    public static void runNumber5(){
        System.out.println("----------Awal Nomor 5---------");
        System.out.print("Masukan kalimat : ");
        String inputSentence = scanner.nextLine();
        System.out.println(" ");
        sortingSentence(inputSentence);
        System.out.println(" ");
        System.out.println("----------Akhir Nomor 5---------");
    }

    /**
     * for sorting a word in sentence.
     * @param sentence .
     */
    public static void sortingSentence(String sentence){
        sentence = sentence.replaceAll("\\s+", "").toLowerCase();

        Map<Character, Integer> wordCount = new TreeMap<>();

        for (char word : sentence.toCharArray()) {
            if (Character.isLetter(word)) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        System.out.println("huruf"+ ": " + "jumlah");
        int totalCount = 0;
        for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
            totalCount = totalCount+ entry.getValue();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Jumlah huruf yang terpakai :" +totalCount);


    }

    /**
     * to running program number six
     *
     */
    public static void runNumber6(){
        System.out.println("----------Awal Nomor 6---------");
        System.out.print("Masukan kedalaman level : ");
        int inputLevel = scanner.nextInt();
        int[][] pascalTriangle = generatePascalTriangle(inputLevel);
        printPascalTriangle(pascalTriangle);
        System.out.println(" ");
        System.out.println("----------Akhir Nomor 6---------");
    }

    /**
     * for generate pascal triangle.
     * @param depth .
     * @return int[][].
     */
    public static int[][] generatePascalTriangle(int depth) {
        int[][] triangle = new int[depth][];

        for (int i = 0; i < depth; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    /**
     * for display pascal triangle.
     * @param triangle .
     */
    public static void printPascalTriangle(int[][] triangle) {

        for (int i = 0; i < triangle.length; i++) {

            for (int k = 0; k < triangle.length - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * to running program number seven
     *
     */
    public static void runNumber7(){
        System.out.println("----------Awal Nomor 7---------");
        System.out.print("Masukan kalimat : ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        String result = filterForHidePunctuation(sentence);
        System.out.println(result);
        System.out.println(" ");
        System.out.println("----------Akhir Nomor 7---------");
    }

    public static String filterForHidePunctuation(String sentence){
        return sentence.replaceAll("[^a-zA-Z0-9]", "");
    }
}