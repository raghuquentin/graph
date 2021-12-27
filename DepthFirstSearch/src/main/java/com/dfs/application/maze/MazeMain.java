package com.dfs.application.maze;

public class MazeMain {
    public static void main(String[] args) {
        int[][] mazeArr = {
                {1,1,1,1,1,1},
                {2,1,0,0,1,0},
                {0,0,0,0,0,0},
                {0,1,0,0,0,1},
                {0,1,1,1,1,0},
                {0,0,1,1,1,0}
        };
        MazeImpl impl = new MazeImpl(mazeArr,1,0);
        impl.findway();
    }
}
