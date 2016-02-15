class Solution {
    class Digit
{
    int value;
    int position;
    Digit(int value, int position)
    {
        this.value=value;
        this.position=position;
    }
    int getPosition()
    {
        return position;
    }
    int getValue()
    {
        return value;
    }
    
}
  Digit max(int A[] , int position)
    {
        int sum=A[position];
        int last=A[position];
        int size=A.length;
       
       while(sum>=last && position<=size)
        {
            last=sum;
          
            position++;
           
            if(position<size)
            sum+=A[position];
           
            
           
            
        }
  
        return  new Digit(last,position);
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Solution test= new Solution();
        //int A[]={2,-6,3000};
        //int A[]={2,5,0,-1,2,10};
        //int A[]={1,-2,20};
        int i=0;
        
        int max=A[0];
        
        while(i<A.length )
        {
         Digit curr=test.max(A, i);
         i++;
         int value=curr.getValue();
  
         if(value> max)
         {
             max=value;
         }
         }
        return max;
        }
    }
