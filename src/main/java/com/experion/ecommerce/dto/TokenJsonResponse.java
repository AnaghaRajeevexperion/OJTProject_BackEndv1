package com.experion.ecommerce.dto;


import lombok.Data;

@Data
public class TokenJsonResponse {
    private String iss;
    private String azp;
    private String aud;
    private String sub;
    private String email;
    private String email_verified;
    private String at_hash;
    private String name;
    private String picture;
    private String given_name;
    private String family_name;
    private String exp;
    private String jti;
    private String nbf;
    private String iat;
    private String hd;
    private String locale;
}
