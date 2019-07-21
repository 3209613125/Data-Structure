//机器人走方格
//从左上角走到右下角，向下或者向右走
//状态f(i,j),从左上角到(i,j)路径总数
//f(i,j) = f(i-1,j) + f(i,j-1)
//初始状态:
//f(0,0) = 1



import java.util.Scanner;
import java.util.Stack;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=3;
        int y=3;
        if(x==0||y==0)
            System.out.println(0);
        else if(x==1||y==1)
            System.out.println(1);
        else{
            int [][]f=new int[x][y];
            for(int j=0;j<y;j++){
                f[0][j]=1;
            }
            for(int i=0;i<x;i++){
                f[i][0]=1;
            }
            for(int i=1;i<x;i++){
                for(int j=1;j<y;j++){
                    f[i][j]=f[i][j-1]+f[i-1][j];
                }
            }
            System.out.println(f[x-1][y-1]);

        }
    }
}

