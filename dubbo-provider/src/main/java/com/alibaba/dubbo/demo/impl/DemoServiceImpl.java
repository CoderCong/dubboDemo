package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/10/17.
 */
public class DemoServiceImpl  implements DemoService{
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id -1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id +1));
        return demo;
    }
}
