package March_2;

public class Q221MaximalSquare {
    public static int maximalSquare(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int area = 0;
        int[][] newMatrix = new int [n+1][m+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == '1'){
                    area = 1;
                    newMatrix[i][j]=1;
                } else {
                    newMatrix[i][j]=0;
                }

            }
        }

        for(int i = 1; i<n; i++) {
            for(int j = 1; j<m; j++) {
                if(matrix[i][j] =='1'){
                    newMatrix[i][j] = Math.min(newMatrix[i-1][j], Math.min ( newMatrix[i-1][j-1], newMatrix[i][j-1] )) + 1 ;
                }
                area = Math.max(area,newMatrix[i][j]);
            }
        }

        return area*area;
    }
    public static void main(String[] args){
        char[][] inte = {{'1','0','1','0','0'}
                        ,{'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}};
        System.out.println(maximalSquare(inte));
    }
}
