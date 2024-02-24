package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Courier courier = context.getBean(Courier.class);
        courier.deliverMedicine("+77022022202");

        Medicine painkiller1 = context.getBean("painkiller", Medicine.class);
        painkiller1.displayInfo();

        Medicine painkiller2 = context.getBean("painkiller", Medicine.class);
        painkiller2.displayInfo();

        Medicine antibiotic1 = context.getBean("antibiotic", Medicine.class);
        antibiotic1.displayInfo();

        Medicine antibiotic2 = context.getBean("antibiotic", Medicine.class);
        antibiotic2.displayInfo();
    }
}
