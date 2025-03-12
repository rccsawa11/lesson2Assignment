import java.util.Scanner; 

class Items 

{  
    String title; 
    int publicationYear; 
    public static void main(String[] args) 
    {
        System.out.println("type in testing scanner");
        Scanner stringScanner = new Scanner(System.in);
        String title = stringScanner.next();
        System.out.println("The title of the book you want is: " + title);

        
    }

}