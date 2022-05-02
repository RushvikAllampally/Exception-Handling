package Exception_Handling;

public class MissingGradeException extends Exception{
    private static int studentId ;
    
    public MissingGradeException(int data){
        studentId = data ;
        //super(data);
    }
    public static int getStudentId(){
        return studentId ;
    }
}