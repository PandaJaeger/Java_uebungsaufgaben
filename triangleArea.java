public class TriangleArea {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base= getBase(sc);
        double hight= getHight(sc);
        double area= getArea(lenght,hight/2);
        displayData(lenght,hight,area);
    }
    
    public static double getBase(Scanner sc){
        System.out.println("Enter the Lenght of the triangle (BASE):" );
        return sc.nextDouble();
    }
    
    public static double getHight(Scanner sc){
        Sytem.out.println("Enter the hight of the Triangle: ");
        return sc.nextDouble();
    }
    
    public Static double getArea(double base, double hight){
        double area = base * hight / 2;
        return area;
    }

