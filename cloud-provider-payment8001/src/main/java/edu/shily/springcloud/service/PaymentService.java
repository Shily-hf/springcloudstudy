package edu.shily.springcloud.service;

import edu.shily.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Shily-zhang
 * @Description
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
