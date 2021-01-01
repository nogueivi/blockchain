package com.blockchain.ucoin.utils;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;

@Service
public class SecurityUtils {
    
    public static String encode(String text) {
        return Hashing.sha256().hashString(text, StandardCharsets.UTF_8).toString();
    }
    
    public static boolean match(String text, String encodedText) {
        return encode(text).equals(encodedText);
    }
    
}
