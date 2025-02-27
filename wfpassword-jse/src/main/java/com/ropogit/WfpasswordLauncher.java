package com.ropogit;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import jakarta.xml.bind.DatatypeConverter;

public class WfpasswordLauncher {
    private static final String PASSWORD = "admin:ManagementRealm:a";
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String result = DatatypeConverter
                .printHexBinary(MessageDigest.getInstance("MD5").digest(PASSWORD.getBytes()));
        System.out.println(result.toLowerCase());
    }
}
