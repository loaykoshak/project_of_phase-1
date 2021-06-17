import java.io.File;
import java.util.Scanner;

public class List_Files {
Scanner scan = new Scanner(System.in);
public void List() {
try {
File file = new File("C:/PR");
File[]list = file.listFiles();
//Prints the files in file name ascending order
for (int i = 0; i < list.length; i++) {
if (list[i].isFile()) {
System.out.println( list[i].getName());
}
}

}catch(Exception ex) {
System.out.println("something went wrong ! please try again\n\n");
}finally {
Menu obj = new Menu();
obj.chose();
}
}
}