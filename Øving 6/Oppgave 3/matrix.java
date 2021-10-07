public class matrix { 
    private int[][]matrix1;
    private int rows;
    private int columns;

    public matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }
    
    public matrix(int[][]matrix1){
        this.matrix1 = matrix1;
        columns = matrix1[0].length;
        rows = matrix1.length;
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }
    public String toString(){
        java.util.Random random = new java.util.Random();
        String output = "";
            for (int i = 0; i < columns; i++) {
                output+="[";
                for (int j = 0; j < rows; j++) {
                    output += (matrix1[i][j] + ", ");
                }
                output+="]";
                output+="\n";
            }
            return output;
    }
    public matrix addere(int[][] matrix2){
        int[][] mat = new int[columns][rows];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return new matrix(mat);
    }

    public matrix multiplisere(int[][] matrix2){
        int[][] mat = new int[columns][rows];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] += matrix1[i][j]*matrix2[j][i];
            }
        }
        return new matrix(mat);
    }

    public matrix transponere(){
        int[][] mat = new int[columns][rows];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                mat[i][j] = matrix1[j][i];
            }
        }
        return new matrix(mat);

    }
}
