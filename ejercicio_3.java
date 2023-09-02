public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      
            double a=s[0];
            double b=s[1];
            double c=s[2];
            double temp = 0;
            double[] matriz = new double[n];
            double suma;

            if(n > 0){
                    for (int i = 0; i < n; i++) {
                        suma = 0;
                        if(i == 0){
                            matriz[i] = a;    
                        }else if(i == 1){
                            matriz[i] = b;
                        }else if(i == 2){
                            matriz[i] = c;
                        }else{
                            suma = a + b + c;
                            matriz[i] = suma;

                            a = b;
                            b = c;
                            c = matriz[i];    
                        } 
                    }
            } 
        return matriz;
  }
}