//Π的表示  Math.acos(-1)
//开方  Math.sqrt()
//平方 Math.pow()
//保留几位小时 String.format("%.xf",double类型的小数)
//计算三分之四 不能直接4/3*其他项，而要将其分开：4*其他项/3，这两者运算结果完全不同

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();
            System.out.print(String.format("%.3f", r(x,y,z,x1,y1,z1) ));
            System.out.print(" ");
            System.out.println(String.format("%.3f",s(r(x,y,z,x1,y1,z1))));
        }
    }
    public static double r(double x,double y,double z,double
                           x1,double y1,double z1 ){

        return  Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)+Math.pow(z-z1,2));
    }

    public static double s(double r){
        return 4*Math.acos(-1)*Math.pow(r,3.0)/3;
    }
}
