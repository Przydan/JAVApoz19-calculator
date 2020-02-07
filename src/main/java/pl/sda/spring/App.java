package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.spring.operation.OperationType;

public class App {

    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator bean = appCtx.getBean(Calculator.class);
        double result = bean.calculate(OperationType.ADDITION, 2.0, 3.0);

        double result2 = bean.calculate(OperationType.DIVISION, 10.0, 2.0);

        double result3 = bean.calculate(OperationType.MULTIPLICATION, 2, 6);

        double result4 = bean.calculate(OperationType.POWER, 2, 2);

        double result5 = bean.calculate(OperationType.PERCENTAGE, 100, 10);

        double result6 = bean.calculate(OperationType.SUBTRACTION, 100, 10);


        System.out.println("Calculation result: " + result);
        System.out.println("Calculation result: " + result2);
        System.out.println("Calculation result: " + result3);
        System.out.println("Calculation result: " + result4);
        System.out.println("Calculation result: " + result5);
        System.out.println("Calculation result: " + result6);


    }


}
