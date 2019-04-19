package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 启动分布式配置中心 读取远程git仓库获取配置
 * 所有spring的配置中心的配置文件 都有以下几种分布式格式组成
 * 1 配置文件属于哪个应用的(application)
 * 2 配置文件属于哪个阶段的 (profile) 开发阶段 测试阶段 产品阶段
 * 3 在git仓库中哪个分支
 * @author Admin
 *
 */
@SpringBootApplication
@EnableConfigServer
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
