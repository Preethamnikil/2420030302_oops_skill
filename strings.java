package myproject;
import java.util.*; 
public class strings {
  public static void main(String args[]) {
    String str="hello this is java class";
    String str1="hello";
    String str2="HeLLO";
    String str3="hi how are you";
    String str4="hello";
    String str5="1234";
    String str6="java234";
    String str7="";
    String str9="   hello java  ";
    System.out.println(str.length());
    System.out.println(str1.toUpperCase());
    System.out.println(str2.toLowerCase());
    System.out.println(str3.charAt(9));
    System.out.println(str1.compareTo(str4));
    System.out.println(str1.compareToIgnoreCase(str2));
    System.out.println(str1.concat(str3));
    System.out.println(str1.contains("hel"));
    System.out.println(str1.contentEquals(str4));
    System.out.println(str.endsWith("lo"));
    System.out.println(str1.equals(str4));
    System.out.println(str1.indexOf("l"));
    System.out.println(str6.matches("[a-z]+\\d+"));
    System.out.println(str7.isEmpty());
    System.out.println(str.join("|",str2,str3,str4));
    System.out.println(str1.lastIndexOf('l'));
    System.out.println(str1.replace('l','p'));
    String str8[]=str3.split(" ");
    for(String i:str8) {
      System.out.println(i);
    }
    System.out.println(str6.startsWith("j"));
    System.out.println(str.subSequence(5,12));
    System.out.println(str9.trim());
    float f=9.8f;
    System.out.println(String.valueOf(9.8));
    char arr[]=str4.toCharArray();
    System.out.println();
  }
}