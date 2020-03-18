package com.codedancing.spring5.cdmedia.config;

import com.codedancing.spring5.cdmedia.MediaPlayer;
import com.codedancing.spring5.cdmedia.impl.CDPlayer;
import com.codedancing.spring5.cdmedia.impl.ZhouDisc;
import org.springframework.context.annotation.*;

/**
 * 1. 声明为配置类
 * 2. 启用组件扫描，默认扫描与配置类相同的包，两种方式：包名 和 空标记接口
 */
@Configuration
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class CDPlayerConfig {

    private ZhouDisc zhouDisc;

    @Bean
    public MediaPlayer getCDPlayer() {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCompactDisc(zhouDisc);
        return cdPlayer;
    }

}
