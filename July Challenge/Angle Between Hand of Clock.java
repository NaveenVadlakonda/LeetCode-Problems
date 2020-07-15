class Solution {
    public double angleClock(int hour, int minutes) {
      double c_no=(double)minutes/5;
      double angle = Math.abs((hour-c_no))*30;
      double temp;
      if(hour<=c_no) temp=Math.abs(angle-(double)minutes/2);
      else temp=Math.abs(angle+(double)minutes/2);
      return Math.min(temp,Math.abs(360-temp));  
    }
}