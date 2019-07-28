class Pattern{
	public static void main(String args[]){
		int i,j;
		for(i=1;i<=4;i++){
			for(j=1;j<=4-i;j++)
				System.out.println(" ");
			for(j=1;j<=i;j++)
				System.out.print(j+" ");
			for(j=i-1;j>0;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
