package security;

public interface ISecuritySystem {
    boolean authenticate(String correctPin, String pinInput);
}
