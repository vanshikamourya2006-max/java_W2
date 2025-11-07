package lec03;

public class stringmethods {
    public static void main(String[] args){
        String str= new String("vanshika");
        String str2= new String("vanshika");
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("v"));
        System.out.println(str.trim());
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,3));
        System.out.println(str==str2);//wrong method
        System.out.println(str.equals(str2));
        System.out.println(str.split(""));

        String str3="hello java";
        String[] a=str3.split(" ");
    



    }
}
