package edu.shily.springcloud.controller;


import edu.shily.springcloud.entities.CommonResult;
import edu.shily.springcloud.entities.Payment;
import edu.shily.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Shily-zhang
 * @Description
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*************插入返回结果：" + result);
        if (result > 0){
            return new CommonResult<>(200,"插入数据库成功,server port:" + serverport,result);
        }
        return new CommonResult<Integer>(444,"插入数据库失败",null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("**********查询结果：" + payment);
        if (payment != null){
            return new CommonResult<>(200,"插入数据库成功,server port:" + serverport,payment);
        }
        return new CommonResult<>(444,"插入数据库失败" + id,null);
    }
}
