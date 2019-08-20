import java.util.*;
class Sum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    
    int a[] = new int[5];
    int b[] = new int[5];
   int  sum =0;
	int arr[]= new int[5];

    for (int i = 0; i < 5; i++) {
        a[i] = sc.nextInt();
    }
    for (int j = 0; j < 5; j++) {
        b[j] = sc.nextInt();
    }
int k=0;
    for(int i=0;i<5;i++)
    {
        
        for(int j=0;j<5;j++)
        {

        
            if(a[i]==b[j])
            {
		arr[k]=a[i];
                sum+=a[i];
		k++;
		break;
              
            }    
            
        }
    }
    if(sum!=0)
        System.out.println("there are common elements:"+sum);
    
    else
    System.out.println("there are no common elements");
    

    
       
      
    }
}