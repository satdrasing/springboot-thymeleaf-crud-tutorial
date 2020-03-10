package net.javaguides.springboot.tutorial.util;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;

public class PasswordGenerator {

    public static void main(String[] args) {

        String encodedPassword = generatePassword("sa");
        System.out.println(encodedPassword);
    }

    public static String generatePassword(String rawString){

       return PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(rawString);
    }
}
