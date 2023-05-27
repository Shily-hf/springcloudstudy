package edu.shily.springcloud.controller;

import edu.shily.springcloud.entities.CommonResult;
import edu.shily.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shily-zhang
 * @Description
 */
@RestController
public class OrderController {

    // public static final String PaymentSrv_URL = "http://localhost:8001";
    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/" + id,CommonResult.class,id);
    }


}
