class Test
{
	public static void main(String args[])
	{
	  int arr[]={10,8,4,6,9};
	  int i,j,key;
	  int n =arr.length;
	  for(i=1;i<n;++i)
	  {
	  	key=arr[i];
	  	j=i-1;
	  	/*move element of arr[0..i-1], that are
	  	greater than key,to one position ahead 
	  	of their current position*/
	    while(j>=0 && arr[j] > key)
	    {
	     
	        arr[j+1]=arr[j];
	        j=j-1;
	      }
	      arr[j + 1] = key;
	    }
	  
	  System.out.println("after sorting");
	  for(i=0;i<arr.length;i++)
	  {
	   System.out.println(arr[i]);
	  }
	}
}