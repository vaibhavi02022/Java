import java.util.*; 
 
 class LogicalOR { 
    public static int logicalOr(int A, int B) { 
        return A | B; 
    } 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        System.out.println(logicalOr(A, B)); 
    } 
} 