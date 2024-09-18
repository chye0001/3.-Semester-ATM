package security;

public class SecuritySystem implements ISecuritySystem{

    @Override
    public boolean authenticate(String correctPin, String pinInput){
        return correctPin.equals(pinInput);
    }
}
