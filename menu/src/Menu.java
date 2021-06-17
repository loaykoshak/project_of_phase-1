import java.util.Scanner;

public class Menu {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
chose();
}
public static void chose() {
try {
System.out.println("------- Welcome in LockMe -------\n\n");
System.out.println("select what operation you need:");
System.out.println("1- List Files");
System.out.println("2- File Manipulating");
int num = scan.nextInt();
if (num == 1) {
List_Files obj2 = new List_Files();
obj2.List();
}else if(num == 2 ) {
File_Manipulating obj = new File_Manipulating();
}else {
System.out.println("something went wrong! please try again\n\n");
chose();
}
}catch(Exception ex) {
System.out.println("something went wrong! please try again\n\n");
chose();
}
}
}