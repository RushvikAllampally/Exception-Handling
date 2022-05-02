package Exception_Handling;

public class InvalidDataException extends Exception{
    // private int studentId ;
    // public static int getStudentid(){
    //     return studentId ;
    // }
    public InvalidDataException(Throwable data){
        //studentId = data ;
        super(data);
    }
}