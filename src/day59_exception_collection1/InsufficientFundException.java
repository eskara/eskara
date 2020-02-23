package day59_exception_collection1;

public class InsufficientFundException extends RuntimeException {
public InsufficientFundException(){
    super();
}
public InsufficientFundException(String desc){
    super(desc);
}
}
