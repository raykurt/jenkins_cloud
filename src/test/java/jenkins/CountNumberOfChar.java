package jenkins;

public class CountNumberOfChar {

    /*
	 	Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */

    public static void main(String[] args) {

        System.out.println(getNumOfChars());
    }

    public static int getNumOfChars() {

        String str = "Java is not very easyyyyy";

        char ch = 'a';

        int firstOccIdx = str.indexOf(ch);
        int lastOccIdx = str.lastIndexOf(ch);
        int counter = 0;

        System.out.println(firstOccIdx);
        System.out.println(lastOccIdx);

        if (firstOccIdx == lastOccIdx) {
            return -1;
        } else {

            for (int i = firstOccIdx + 1; i < lastOccIdx; i++) {

                if (str.charAt(i) != ' ') {
                    counter++;
                }
            }
            return counter;
        }

    }

}
