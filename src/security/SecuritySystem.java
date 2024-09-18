package security;

public class SecuritySystem implements ISecuritySystem{

    @Override
    public boolean authenticate(String correctPin, String pin){
        return correctPin.equals(pin);
    }
}
