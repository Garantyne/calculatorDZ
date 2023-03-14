package pro.calcu.calculatorDZ;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalcuServices implements CalcuInterf {
    public String welcom(){
        return "Добро пожаловать в калькулятор!!!";
    }

    public int summa(int num1, int num2){

        return num1 + num2 ;
    }

    public int mult(int num1, int num2){

        return num1 * num2 ;
    }

    public double divis(int num1, int num2){

        return (double)num1 / num2 ;
    }

    public int substr( int num1, int num2){

        return num1 - num2 ;
    }
}
