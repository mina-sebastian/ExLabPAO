package me.mina.lab5;

public class Application {

    public static void main(String[] args) {
        System.out.println("b".matches("[abc]"));
        System.out.println("m".matches("[^abc]"));
        System.out.println("r".matches("[a-z]"));
        System.out.println("F".matches("[a-zA-Z]"));
        System.out.println("qR".matches("[a-z][A-Z]"));
        System.out.println("abc".matches("[abc]+"));
        System.out.println("aabbc".matches("[abc]{5}"));
        System.out.println("aabbcc".matches("[abc]{5,}"));
        System.out.println("aabbcccc".matches("[abc]{5,10}"));
        System.out.println("Amintim".matches("[A-Z][a-z]+"));
        System.out.println("5663278890".matches("[0-9]+"));
        System.out.println("0731111111".matches("(072|073)[0-9]{7}"));
    }

}
