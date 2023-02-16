package com.shvetsov.security;

public class SecurityConstants {

    public static final String SIGN_UP_URLS = "/api/auth/**";
    public static final String SECRET = "SecretMaskJWT";
    public static final String TOKEN_PREFIX = "Bearer ";// must contain whitespace in the end
    public static final String HEADER_STRING = "Authorization";
    public static final String CONTENT_TYPE = "application/json";
    public static final long EXPIRATION_TIME = 600_000; //mils = 10 minutes
}
