package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by ASUS on 2017/10/17.
 */
public interface DemoService {
    List<String>  getPermissions(Long id);
}
