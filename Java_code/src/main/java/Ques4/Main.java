package Ques4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class);
        Cube cube = applicationContext.getBean(Cube.class);
        SquareRoot squareRoot = applicationContext.getBean(SquareRoot.class);

        System.out.println("Cube of Number is: "+cube.calculate(11));
        System.out.println("SquareRoot of Number is: "+squareRoot.calculate(12));

    }
}
