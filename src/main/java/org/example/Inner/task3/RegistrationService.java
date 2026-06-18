package org.example.Inner.task3;

public class RegistrationService {
    public void registerUser(String email, String password) {
        class Validator {
            public boolean validate() {
                return password.length() > 6 && email.contains("@");
            }
        }
        Validator registerUser = new Validator();
        boolean answer = registerUser.validate();
        if (answer) {
            System.out.println("Registration is successful");
        } else {
            System.err.println("Error of validation");
        }
    }

}

class Main {
    static void main() {
        RegistrationService registrationService = new RegistrationService();
        registrationService.registerUser("minchonGOCH@gmail.com", "126612126");
        RegistrationService registrationService2 = new RegistrationService();
        registrationService2.registerUser("minchonGOCHgmail.com", "126612126");
        RegistrationService registrationService3 = new RegistrationService();
        registrationService3.registerUser("minchonGOCH@gmail.com", "126126");
        RegistrationService registrationService4 = new RegistrationService();
        registrationService.registerUser("minchonGOCHgmail.com", "126126");
    }
}

