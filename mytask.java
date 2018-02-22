class mytask{
  public static void main(String args[]){
    int a[]={0,-3,5,-4,-2,3,1,0};
    int sum_left,sum_right,j,k,l=0;        
    int[] b=new int[a.length];
    System.out.println(a.length);
    for(int i=0;i<a.length;i++){
      sum_left=0;sum_right=0;
      j=i-1;k=i+1;
      while(j>=0){
        sum_left=sum_left+a[j];
        j--;
      }            
      while(k<a.length){
        sum_right=sum_right+a[k];
        k++;
      }
      
      if(sum_left==sum_right){
        b[l]=i;
        l++;
      }
      
    }
    
    for(int i=0;i<l;i++){
      System.out.print(b[i]+" ");
    }
  }
}