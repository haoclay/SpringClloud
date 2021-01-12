package com.softeem.feigninterface.fallback;

import com.softeem.feigninterface.IUserClient;
import org.springframework.stereotype.Component;

@Component
public class UserClidentFallback implements IUserClient {
    @Override
    public Object finduser() {
        return "网络出现异常，请检测网络环境";
    }

    @Override
    public Object findTwoPerson() {
        return "辣鸡";
    }


}
