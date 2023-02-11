public class TempJava {
    public static void PTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la : "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep : "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
    /*
     * Bai Toan Giai Thua
     */
    public static long DQGT(int n) {
    	if (n == 0)
    		return 1;
    	return n * DQGT(n-1);
    }
 
    // bai toan Fibonaci
    public static int Fibo(int m) {
    	if (m < 0)
    		return -1;
    	if (m == 0 || m == 1)
    		return 1;
    	return Fibo(m-1) + Fibo(m-2);
    }
    
    public static boolean KT_Fibo(int r) {
    	for(int i = 0 ; i < r ; i++)
    	{
    		if(Fibo(i) == r)
    			return true;
    	}
    	return false;
    }
    
    
    // UCLN & BCNN
    public static int UCLN(int a ,  int b) {
    	if  (b == 0) 
    		return a;
    	return UCLN(b,a%b);
    }
    public static int BCNN(int a ,  int b) {
    	return (a*b) / UCLN(a,b);
    }
    
    // KTRA SNT 
    public static boolean SNT(int v)
    {
    	if(v < 2)
    		return false;
    	for(int i = 2 ; i <= v/2 ; i++)
    	{
    		if (v % i == 0)
    			return false;
    	}
    	return true;
    }
    
   //TACH SO VD : 123 = 1 + 2 + 3 = 6
    public static int SUM(int o) {
    	int sum = 0;
    	while(o != 0)
    	{
    		sum += (o % 10);
    		o /= 10;
    	}
    	return sum;
    }
    
    // SO DOI NGHICH
    public static boolean KN(int g){
    	int []a = new int [6];
    	int i = 0;
    	while(g != 0)
    	{
    		a[i] = g % 10;
    		g/=10;
    		i++;
    	}
    	if(a[0] == a[5] && a[2] == a[3] && a[1] == a[4])
    		return true;
    	else return false;
    }
}