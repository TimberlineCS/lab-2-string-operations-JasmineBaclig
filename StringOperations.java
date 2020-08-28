//Jasmine Baclig
//AP Computer Science AP
//August 28, 2020

public class StringOperations {
  public static void main(String[] args) {
   
    //Challenge 1
    String word = "picture";
    int length = (word.length() / 2);
    String firstHalf = word.substring(0, length);
    String secondHalf = word.substring(length);
    System.out.println(secondHalf + firstHalf);

    //Challenge 2
    System.out.println("     __   \n(___()'`;\n/,    /` \n\\\\\"--\\\\  ");
  }
}