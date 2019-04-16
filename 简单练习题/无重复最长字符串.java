import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("输入的内容为：");
        System.out.println(str1);
        char[] str = str1.toCharArray();
        int[] data = new int[100];
        int k = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str[i] == str[j]) {
                    System.out.print(j - i + " ");
                    data[k] = j - i;
                    k++;
                    break;
                }
            }
        }
        System.out.println("\n");
int max=data[0];
for(int count=0;count<data.length;count++){
    if(max<data[count]){
        max=data[count];
    }
}
        System.out.println("max:"+max);
            }


        }
