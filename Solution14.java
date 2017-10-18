class Pair{
    int x,y;
    Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class Solution14{
    public static Pair find_cell(int grid[][]){
        for(int i=0;i<grid.length;i++)
            {
                boolean foundcol=false;
                int col=-1;
                for(int j=0;j<grid[0].length;j++)
                    {
                        if(grid[i][j] == 0)
                            {
                                foundcol =true;
                                col=j;
                                break;
                            }
                    }
                    if(foundcol)
                        {
                            return new Pair(i,col);
                        }
            }
        return null;
    }
    public static Pair identify(int row,int col)
    {
        int x=-1,y=-1;
        if(row>=0&&row<=2)
            x=0;
        else if(row>=3&&row<=5)
            x=3;
        else
            x=6;
        if(col>=0&&col<=2)
            y=0;
        else if(col>=3&&col<=5)
            y=3;
        else
            y=6;
        return new Pair(x,y);
    }
    public static boolean is_safe(int grid[][],int row,int col,int num)
    {
        // checking row
        for(int i=0;i<grid.length;i++)
            {
                if(grid[i][col] == num)
                    return false;
            }
        //checking column
        for(int i=0;i<grid[0].length;i++)
            {
                if(grid[row][i] == num)
                    return false;
            }
        //checking square
            Pair pair = identify(row,col);
            for(int i=pair.x;i<pair.x+3;i++)
                {
                    for(int j=pair.y;j<pair.y+3;j++)
                        {
                            if(grid[i][j] == num)
                                return false;
                        }
                }
        return true;
    }
    public static boolean sudokuSolver(int grid[][])
    {
        Pair pair = find_cell(grid);
        if(pair == null)
            {
                return true;
            }
        for(int i=1;i<=9;i++)
            {
                if(is_safe(grid,pair.x,pair.y,i))
                    {
                        grid[pair.x][pair.y]=i;
                        boolean result = sudokuSolver(grid);
                        if(result)
                            return true;
                        grid[pair.x][pair.y]=0;
                    }
            }
        return false;
    }
    public static void main(String[] args) {
        
    }
}