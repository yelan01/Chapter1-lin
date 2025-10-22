public class S0039
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int d=2;
        double pi=3.14;
         
        System.out.println("直徑是"+d+"公分的圓");
        System.out.println("真圓周為"+(d*pi)+"公分");

        num1=5;
        num2=4;
        
        double div1=num1/num2;
        double div2=(double)num1/(double)num2;
        
        System.out.println("5/4等於"+div1);
        System.out.println("5/4等於"+div2);
        
    }
}