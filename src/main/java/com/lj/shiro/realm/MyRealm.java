package com.lj.shiro.realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class MyRealm extends AuthorizingRealm {

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        Object principal = authenticationToken.getPrincipal();
        //调用数据库
        //根据username（principal）查询对象

        AuthenticationInfo authenticationInfo = null;

        if("hahah".equals(principal)){
            authenticationInfo = new SimpleAuthenticationInfo("hahah","68609b8b64988c0f4def093eaa025e05", ByteSource.Util.bytes("abcd"),getName());
        }
        return authenticationInfo;
    }
}
