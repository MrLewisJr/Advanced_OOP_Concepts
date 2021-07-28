public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (Double d1, Double d2) -> d1+d2; /* TODO */
                break;
            case "-": res= (Double d1, Double d2) -> d1-d2; /* TODO */
                break;
            case "*": res= (Double d1, Double d2) -> d1*d2; /* TODO */
                break;
            case "/": res= (Double d1, Double d2) -> d2 == 0 ? Double.POSITIVE_INFINITY : d1/d2; /* TODO */
                break;
            default: res = (Double d1, Double d2) -> Double.MIN_VALUE; /* TODO */;
                break;
            }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
      /* TODO */
        DoMath function = this.toOperation(op);

        /* TODO */
        return function.compute(n1,n2);
    }
}
