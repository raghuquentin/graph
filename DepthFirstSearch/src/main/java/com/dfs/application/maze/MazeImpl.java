package com.dfs.application.maze;

public class MazeImpl {
    private int[][] mazeArr;
    private boolean[][] isVisited;
    private int startRow;
    private int startCol;

    public MazeImpl(int[][] mazeArr,int startRow, int startCol){
        this.mazeArr=mazeArr;
        this.isVisited=new boolean[mazeArr.length][mazeArr.length];
        this.startRow=startRow;
        this.startCol=startCol;
    }
    public void findway(){
        if(dfs(startRow,startCol))
            System.out.println("Solution exists");
        else
            System.out.println("No solution exists");
    }

    private boolean dfs(int startRow, int startCol) {
        if(startRow == mazeArr.length-1 && startCol == mazeArr.length-1)
            return true;

        if(findwayHelper(startRow,startCol)){
            isVisited[startRow][startCol] = true;
            if(dfs(startRow+1,startCol))
                return true;
            if(dfs(startRow-1,startCol))
                return true;
            if(dfs(startRow,startCol+1))
                return true;
            if(dfs(startRow,startCol-1))
                return true;
            isVisited[startRow][startCol] = false;
        }
        return false;
    }

    private boolean findwayHelper(int x, int y) {
        if(x<0 || x>mazeArr.length-1)
            return false;
        if(y<0 || y> mazeArr.length-1)
            return false;
        if(isVisited[x][y] == true)
            return false;
        if(mazeArr[x][y] == 1)
            return false;
        return true;
    }
}
