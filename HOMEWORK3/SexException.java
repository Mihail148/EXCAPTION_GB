package HOMEWORK3;

public class SexException extends Exception {
    public SexException(){
    }

    public void sexException(String i){
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Это некорректый формат: %s", i);
        System.out.println();
    }
}
