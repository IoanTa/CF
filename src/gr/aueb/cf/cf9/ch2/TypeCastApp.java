package gr.aueb.cf.cf9.ch2;

public class TypeCastApp {
    public static void main(String[] args) {
        long myLng = (long) 2_123_213_809;
        int myInt = (int) myLng;

        System.out.println(myLng);
        System.out.println("My long is:" + myInt);
        System.out.printf("My long is %d", myLng);
    }
}