// Input:
// r = 4, c = 4
// matrix[][] = {{1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15,16}}
// Output: 
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> lst = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;
        int d = 0;
        
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            
            if(d==0){
                for(int i=colStart; i<=colEnd; i++){
                    lst.add(matrix[rowStart][i]);
                }
                rowStart++;
            }
            if(d==1){
                for(int i=rowStart; i<=rowEnd; i++){
                    lst.add(matrix[i][colEnd]);
                }
                colEnd--;
            }
            
            if(d==2){
                for(int i=colEnd; i>=colStart; i--){
                    lst.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            
            if(d==3){
                for(int i=rowEnd; i>=rowStart; i--){
                    lst.add(matrix[i][colStart]);
                }
                colStart++;
            }
            d = (d+1)%4;
        }
        
        return lst;
        
    }
}
