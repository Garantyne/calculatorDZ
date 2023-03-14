package pro.calcu.calculatorDZ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcuController {
    private final CalcuInterf interfa;
    public CalcuController(CalcuInterf interfa){
        this.interfa = interfa;
    }
    @GetMapping(path = "/calculator")
    public String welcom(){
        return interfa.welcom();
    }
    @GetMapping(path = "/calculator/summa")
    public String summa(@RequestParam("num1") int num1,@RequestParam("num2") int num2){

        return "" + num1 + " + " + num2 +" = " + interfa.summa(num1,num2);
    }
    @GetMapping(path = "/calculator/mult")
    public String mult(@RequestParam("num1") int num1,@RequestParam("num2") int num2){

        return "" + num1 + " * " + num2 +" = " + interfa.mult(num1,num2);
    }
    @GetMapping(path = "/calculator/divis")
    public String divis(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        if(num2!=0){
        return "" + num1 + " / " + num2 +" = " + interfa.divis(num1,num2);
        }else{
            return " Ошибка, на 0 нельзя делить";
        }

    }
    @GetMapping(path = "/calculator/substr")
    public String substr(@RequestParam("num1") int num1,@RequestParam("num2") int num2){

        return "" + num1 + " - " + num2 +" = " + interfa.substr(num1,num2);
    }

}
