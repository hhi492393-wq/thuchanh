Question 11. Write a unit test for that codes 
a. Code
public class Advance5 { 
/*Kiểm tra một số có đối xứng không
* Nếu đối xứng trả về true, ngược lại trả về false
* VD: 112 -> false, 12121 -> true
*/
public boolean kiemTraDoiXung(int number){ 
StringBuilder xau= new StringBuilder(); 
String str= number+""; 
xau.append(str); 
String check= xau.reverse().toString(); 
if(str.equals(check)) 
return true; 
return false; 
} 
} 
b. Testcase 
1. Test Function kiemTraDoiXung
2. Test Function kiemTraDoiXung with expection = true, actual number =12121;
3. Test Function kiemTraDoiXung with expection = true, actual number = 0;
4. Test Function kiemTraDoiXung with expection = false, actual number = -102;
5. Test Function kiemTraDoiXung with expection = true, actual number = -101;