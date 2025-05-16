class Solution {
    public int diagonalSum(int[][] mat) {
    int sum=0;
    int l = mat.length;
    for (int i =0; i<l ; i++)
    {
        sum += mat[i][i];
        sum += mat[i][l-1-i];
    }

    if(l%2==1){
        sum -= mat[l/2][l/2];
    }

    return sum;

    }
}