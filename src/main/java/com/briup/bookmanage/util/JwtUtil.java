package com.briup.bookmanage.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    // 过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    // 私钥
    private static final String TOKEN_SECRET = "privateKey";

    /*
     *生成签名，15分钟过期
     */
    public static String sign(String userId){
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type","Jwt");
            header.put("alg","HS256");
            // 返回Token字符串
            return JWT.create().withHeader(header)
                    .withClaim("userId",userId)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /*
     * 检查token是否正确
     */
    public static  String verify(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            String userId = jwt.getClaim("userId").asString();
            return userId;
        } catch (Exception e){
            return "";
        }
    }
}

//有  判断   password  ===登录
//没有  用户不存在