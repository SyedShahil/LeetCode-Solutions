class Fraction_Addition_and_Subtraction{
    public String fractionAddition(String expression) {
        int num=0;
        int den=1;
        int i=0;
        int n=expression.length();
        while(i<n){
            int sign=1;
            int curnum=0;
            int curden=0;
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-'){
                if(ch=='-'){
                    sign=-1;
                }
                i++;
            }
            int start=i;
            while(i<n && Character.isDigit(expression.charAt(i))){
                i++;
            }
            if(start!=i){
            curnum=Integer.parseInt(expression.substring(start,i))*sign;
            }
             if (i < n && expression.charAt(i) == '/') {
                i++;
            }
             start=i;
            while(i<n && Character.isDigit(expression.charAt(i))){
                i++;
            }
            if(start!=i){
            curden=Integer.parseInt(expression.substring(start,i));
            }
              num=num*curden+den*curnum;
            den=den*curden;
        int gcd=fgcd(Math.abs(num),den);
         num=num/gcd;
         den=den/gcd;
        }
    
      
        return num+"/"+den;
    }
    public int fgcd(int a,int b){
        if(a==0)return b;
      return  fgcd(b%a,a);
    }
}
