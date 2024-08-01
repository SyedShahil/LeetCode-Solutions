class Number_of_Senior_Citizens{
    public int countSeniors(String[] details) {
     int ans=0;
        for(int i=0;i<details.length;i++){
            String temp=details[i].substring(11,13);
            int t1=Integer.parseInt(temp);
            if(t1>60){
                ans++;
            }
        }
        return ans;
    }
}
