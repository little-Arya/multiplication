package com;

public class WorkThread implements Runnable {

    private int start;//计算开始位置，以此区分工作线程工作任务
    private int [][]A;
    private int [][]B;
    private int [][]C;

    //工作线程构造方法
    public WorkThread(int start,int [][]A,int [][]B,int [][]C){
        this.start=start;
        this.A=A;
        this.B=B;
        this.C=C;
    }

    @Override
    public void run() {


        int i,j,k;
        //根据线程数量划分每个工作线程任务
        for(i=start; i<Driver.M; i +=Driver.NUM_THREADS)
        {
            for(j=0;j<Driver.N;j++)
            {
                for( k=0; k< Driver.K;k++)
                    C[i][j]+=A[i][k]*B[k][j];
            }
        }

    }
}
