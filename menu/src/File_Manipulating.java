import java.io.File;
import java.util.Scanner;

public class File_Manipulating {
Scanner scan = new Scanner(System.in);
public File_Manipulating() {
System.out.println("choose a method you want:");
System.out.println("1- ADD");
System.out.println("2- Delete");
System.out.println("3- Search");
System.out.println("4- Back To main menu");
System.out.println("5- Exit");
Home(scan.nextInt());
}
public void Home(int choice) {
try {
if(choice>5 ||choice<1) {
}else {
switch(choice) {
case 1:
Add();
break;
case 2 :
Delete();
break;
case 3:
Search();
break;
case 4 :
GetBackToMainMenu();
break;
case 5 :
Exit();
}
}
}catch(Exception ex) {
System.out.println("something went wrong ! please try again\n\n");
File_Manipulating obj = new File_Manipulating();
}
}
public void Add() {
try {
System.out.println("Enter file name:");
String name = scan.next();
String path = "C:"+File.separator+"PR"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();
file.createNewFile();
System.out.println("\n file created ! \n\n");
}catch(Exception ex) {
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulating obj = new File_Manipulating();
}
}
public void Delete() {
try {
System.out.println("Enter file name:\n");
String name = scan.next();
String path = "C:"+File.separator+"PR"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();
if(file.delete())
System.out.println(file.getName()+" deleted !\n");
else
System.out.println("\nfile not found ! \n");
}catch(Exception ex) {
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulating obj = new File_Manipulating();
}
}
public void Search() {
try {
System.out.println("Enter file name:\n");
String name = scan.next();
String path = "C:"+File.separator+"PR"+File.separator+name+".txt";
File file = new File(path);
file.getParentFile().mkdirs();
if(file.exists())
System.out.println(file.getName()+" founded ! \n");
else
System.out.println("file not found! ");
}catch(Exception ex){
System.out.println("\n\n"+ex.getMessage().toString());
}finally {
File_Manipulating obj = new File_Manipulating();
}
}
public void Exit() {
System.out.println("are you sure? yes or no \n");
String answer = scan.next();
if(answer.equalsIgnoreCase("no")) {
File_Manipulating obj = new File_Manipulating();
}else if(answer.equalsIgnoreCase("yes")) {
System.out.println("\n\ngood bye !");
}else {
File_Manipulating obj = new File_Manipulating();
}
}
public void GetBackToMainMenu() {
Menu obj = new Menu();
obj.chose();
}
}