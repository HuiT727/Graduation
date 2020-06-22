package com.example.demo.util;

import com.example.demo.common.CustomException;
import com.example.demo.common.ResultCode;
import com.example.demo.entity.Audience;
import io.jsonwebtoken.*;

import lombok.extern.slf4j.Slf4j;


import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.*;

import lombok.extern.slf4j.Slf4j;


import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

@Slf4j
public class JwtTokenUtil {
    public static final String AUTH_HEADER_KEY = "Authorization";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static Claims parseJWT(String jsonWebToken,String base64Security){

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        }catch (ExpiredJwtException eje){

            log.error("=======Token过期=======",eje);
            throw new CustomException(ResultCode.PERMISSION_TOKEN_EXPIRED);
        }catch (Exception e){
            log.error("==========token解析异常==========",e);
            throw new CustomException(ResultCode.PERMISSION_TOKEN_INVALID);
        }
    }
    /**
     *  * @param userId
     * @param username
     * @param role
     * @param audience
     * <br/>
     * 生成jwt
     * @return java.lang.String
     * @author HuiT
     * @date 2020/4/11 21:57
     */

    public static String createJWT(String userId, String username, String role, Audience audience){
        try{

            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            long nowMills = System.currentTimeMillis();
            Date now = new Date(nowMills);
            log.info("############----------nowMills={}-----------#############",now);

            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(audience.getBase64Secret());
            Key signingKey = new SecretKeySpec(apiKeySecretBytes,signatureAlgorithm.getJcaName());
            String encryId = Base64Util.encode(userId);

            JwtBuilder builder = Jwts.builder().setHeaderParam("typ","JWT")
                    .claim("role",role)
                    .claim("userId",userId)
                    .setSubject(username)     //代表这个JWT的主体，即它的所有人
                    .setIssuer(audience.getClientId())          //代表这个JWT的签发主体
                    .setIssuedAt(now)        //是一个时间戳，代表这个JWT的签发时间
                    .setAudience(audience.getName())        //代表这个JWT的接收对象
                    .signWith(signatureAlgorithm,signingKey);
            //添加Token过期时间
            int TTLMills = audience.getExpiresSecond();
            if(TTLMills >= 0 ){
                long expMills = nowMills + TTLMills;
                Date exp = new Date(expMills);
                log.info("############----------过期时间={}-----------#############",exp);
                log.info("############----------jwt生效开始时间={}-----------#############",now);
                builder.setExpiration(exp)//是一个时间戳，代表这个JWT的过期时间
                        .setNotBefore(now);//是一个时间戳，代表这个JWT生效的开始时间，意味着在这个时间之前验证jwt是会失败的
            }
            //生成JWT
            return builder.compact();
        }catch (Exception e){
            log.error("签名失败",e);
            throw new CustomException(ResultCode.PERMISSION_SIGNATURE_ERROR);
        }
    }

    /**
     *  * @param token
     * @param base64Security
     * <br/>
     * 从token中获取用户名
     * @return java.lang.String
     * @author HuiT
     * @date 2020/4/11 22:02
     */
    public static String getUsername(String token,String base64Security){
        String userName = null;
        try{
            userName =  parseJWT(token,base64Security).getSubject();
        }catch(ExpiredJwtException e)
        {
            userName = e.getClaims().getSubject();
        }
        return userName;
    }
    /**
     *  * @param token
     * @param base64Security
     * <br/>
     * 从token中获取用户ID
     * @return java.lang.String
     * @author HuiT
     * @date 2020/4/11 22:59
     */
    public static String getUserId(String token,String base64Security){
        String userId = null;
        try{
            userId = parseJWT(token,base64Security).get("userId",String.class);
        }catch (ExpiredJwtException e){
            userId = e.getClaims().get("userId",String.class);
        }
        return userId;
    }
    /**
     *  * @param token
     * @param base64Security
     * <br/>
     * 是否已过期
     * @return boolean
     * @author HuiT
     * @date 2020/4/11 23:06
     */
    public static boolean isExpiration(String token,String base64Security){
        return parseJWT(token,base64Security).getExpiration().before(new Date());
    }
}
