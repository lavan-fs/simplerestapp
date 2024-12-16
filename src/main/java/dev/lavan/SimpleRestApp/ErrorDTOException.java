package dev.lavan.SimpleRestApp;



public class ErrorDTOException extends RuntimeException{

private final ResponseDTO ResObj;

   public  ErrorDTOException(String error,String Data,ResponseDTO ResObj){

this.ResObj=ResObj;
            ResObj.setData(Data);
            ResObj.setError(error);
            ResObj.setStatus("failure");




}
public Object getDTOObj(){
        return ResObj;
}
}
