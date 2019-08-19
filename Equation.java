package sourcecode.CramersRule;

public class Equation {
    private double firstCoefficient;
    private double secondCoefficient;
    private double result;

    public Equation (double firstCoefficient, double secondCoefficient, double result){
        this.firstCoefficient = firstCoefficient;
        this.secondCoefficient = secondCoefficient;
        this.result = result;
    }

    public double getFirstCoefficient(){
        return this.firstCoefficient;
    }

    public double getSecondCoefficient(){
        return this.secondCoefficient;
    }

    public double getResult(){
        return this.result;
    }
}
