package org.example.vhr;

import org.example.vhr.Security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private HrService hrService;

    /***
     * 根据账号获取用户信息
     * @param username :
     * @return: org.springframework.security.core.userdetails.UserDetails
     */
    @Override
    public SecurityUser loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中取出用户信息
        Hr hr = hrService.findByUserName(username);
        // 判断用户是否存在
        if (ObjectUtils.isEmpty(hr)){
            throw new UsernameNotFoundException("用户名不存在！");
        }
        // 返回UserDetails实现类
        return new SecurityUser(hr);
    }
}
