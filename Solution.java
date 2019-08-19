package sourcecode.CramersRule;

public class Solution{
    private Equation firstEquation;
    private Equation secondEquation;

    public Solution (Equation firstEquation, Equation secondEquation){
        this.firstEquation = firstEquation;
        this.secondEquation = secondEquation;
    }

    private double getCommonDeterminant(){
        Matrix matrix = 
            new Matrix(firstEquation.getFirstCoefficient(), firstEquation.getSecondCoefficient(),
            secondEquation.getFirstCoefficient(), secondEquation.getSecondCoefficient());

        return matrix.getDeterminant();
    }

    private double getXDeterminant(){
        Matrix matrix = 
            new Matrix(firstEquation.getResult(), firstEquation.getSecondCoefficient(),
            secondEquation.getResult(), secondEquation.getSecondCoefficient());
        
        return matrix.getDeterminant();
    }

    private double getYDeterminant(){
        Matrix matrix = 
            new Matrix(firstEquation.getFirstCoefficient(), firstEquation.getResult(),
            secondEquation.getFirstCoefficient(), secondEquation.getResult());

        return matrix.getDeterminant();
    }

    public double getX(){
        return getXDeterminant() / getCommonDeterminant();
    }

    public double getY(){
        return getYDeterminant() / getCommonDeterminant();
    }
}
