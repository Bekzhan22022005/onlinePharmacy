package org.example;

import org.springframework.stereotype.Component;

@Component
public class CourierImpl implements Courier {
    @Override
    public void deliverMedicine(String phoneNumber) {
        System.out.println("Курьер дәріханадан дәрілерді алып келе жатыр. Телефон нөмері: " + phoneNumber);
    }
}
