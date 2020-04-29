package com.bjtu.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 在xml中配置的账号密码校验过于简单，使用下面的自定义校验器
 */
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //校验用户是否是VIP
        //校验其他条件等等等
        //假设上面校验成功
        //假设这个密码是从数据库根据用户名查询出来的
        String pwd = "$2a$10$5LamFpTSKa93vXWtqdNnXOAaXCHlKB4QnYubWffS0RNdSyw4hd.cC";
        List<GrantedAuthority> grantedList = new ArrayList<>();
        grantedList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        grantedList.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(s, pwd, grantedList);
    }
}
