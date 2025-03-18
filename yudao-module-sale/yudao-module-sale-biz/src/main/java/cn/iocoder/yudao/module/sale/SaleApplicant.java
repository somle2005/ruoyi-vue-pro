package cn.iocoder.yudao.module.sale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 11:19
 **/
@SpringBootApplication(scanBasePackages = {"com.somle", "cn.iocoder.yudao.module"})
@MapperScan(basePackages = {"com.somle", "cn.iocoder.yudao.module"})
public class SaleApplicant {

    public static void main(String[] args) {
        SpringApplication.run(SaleApplicant.class, args);
    }

}
