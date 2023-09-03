package HOMEWORK3;

public class DataException extends Exception {
    public DataException(){
    }

    public void dataException(String i){
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это некорректный формат: %s", i);
        System.out.println();
    }
}
