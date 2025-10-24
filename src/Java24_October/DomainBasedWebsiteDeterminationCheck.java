package Java24_October;
/*:- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites
 */
import java.util.*;
public class DomainBasedWebsiteDeterminationCheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Website url:");
        String url=sc.next();
        int lastDot= url.lastIndexOf('.')+1;
        String domain=url.substring(lastDot);
        if(domain.equals("com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if(domain.equals("org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }
        else if(domain.equals("edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if(domain.equals("gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if(domain.equals("net"))
        {
            System.out.println("The website type is: Network-related website");
        }
        else if(domain.equals("info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
