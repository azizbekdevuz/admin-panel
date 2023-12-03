import org.springframework.security.core.AuthenticationException;

public interface AuthenticationService {
    String authenticate(String username, String password) throws AuthenticationException;
}
