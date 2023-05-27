package edu.shily.springcloud.service.Impl;

import edu.shily.springcloud.dao.PaymentDao;
import edu.shily.springcloud.entities.Payment;
import edu.shily.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Shily-zhang
 * @Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
