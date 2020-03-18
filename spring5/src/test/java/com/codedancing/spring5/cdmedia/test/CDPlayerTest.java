package com.codedancing.spring5.cdmedia.test;

import com.codedancing.spring5.cdmedia.config.CDPlayerConfig;
import com.codedancing.spring5.cdmedia.impl.CDPlayer;
import com.codedancing.spring5.cdmedia.impl.WangDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 1. SpringJUnit4ClassRunner:  在测试的时候自动创建Spring的应用上下文
 * 2. ContextConfiguration:     在 CDPlayerConfig 类中加载配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private WangDisc wangDisc;

    @Test
    public void testCDPlayer() {
        cdPlayer.play();
    }

    @Test
    public void testGetWangDisc() {
        wangDisc.play();
    }


}
