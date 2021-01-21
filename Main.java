public class Main {
public static void main(String[] args) {
int arr[][]={{1,3,4},{2,4,3},{3,4,5}};    
int arr1[][]={{1,3,4},{2,4,3},{1,2,4}};    
      
int arr2[][]=new int[3][3];  
        
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
arr2[i][j]=arr[i][j]+arr1[i][j];      
System.out.print(arr2[i][j]+" ");    
}    
System.out.println();   
}    
	}
}
