package sourcecode.CramersRule;

public class Matrix {
    private double[][] coefficients;

    public Matrix(double... coefficients){
        if (coefficients.length == 4){
            this.coefficients = new double[2][2];
            int index = 0;

            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                    this.coefficients[i][j] = coefficients[index++];
                }
            }
         }
    }

    private double getLeadingProduct(){
        return coefficients[0][0] * coefficients[1][1];
    }

    private double getLaggingProduct(){
        return coefficients[0][1] * coefficients[1][0];
    }

    public double getDeterminant(){
        return getLeadingProduct() - getLaggingProduct();
    }
}
