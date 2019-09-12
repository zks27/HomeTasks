package customExceptionHomeTask;

public class ResourceNotFoundException extends RuntimeException{

    ResourceNotFoundException (){

    }

    @Override
    public String toString() {
        return "не найдена";
    }
}
