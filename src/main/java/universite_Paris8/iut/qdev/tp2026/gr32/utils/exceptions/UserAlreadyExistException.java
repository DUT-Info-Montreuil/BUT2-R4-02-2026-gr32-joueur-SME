package universite_Paris8.iut.qdev.tp2026.gr32.utils.exceptions;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
