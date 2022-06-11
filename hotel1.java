package hotel;

import java.util.Scanner;
import java.sql.*;

interface hotel{
	void menulist();
	void order();
	void insert();
	void update();
	void display();
	void delete();
	void rating();
	void exit();
	
	
}

public class hotel1 implements hotel{
	

	
	@Override
	public void menulist() {
		System.out.println("--------------------------------------");
		System.out.println("Enter your choice");
		System.out.println("1.insert");
		System.out.println("2.order");
		System.out.println("3.update");
		System.out.println("4.display");
		System.out.println("5.rating");
		System.out.println("6.delete");
		System.out.println("7.Exit");
		
	}

	@Override
	public void insert() {
		
		try {
			System.out.println("*********************************************");
			System.out.println("Enter your new customer details here");
			System.out.println("*********************************************");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
			Scanner sc=new Scanner(System.in);
			PreparedStatement ps=con.prepareStatement("insert into hotel values(?,?,?,?,?,?,?,?)");
            System.out.println("Enter the id");
            int id=sc.nextInt();
            System.out.println("Enter the name");
            String name=sc.next();
           System.out.println("Enter your order menu");
           String order_menu=sc.next();
           System.out.println("Enter your order quantity");
           int quantity=sc.nextInt();
           System.out.println("Enter your bill");
           int bill=sc.nextInt();
           System.out.println("Enter your address");
           String address=sc.next();
           System.out.println("Enter your phoneno" );
           String phoneno=sc.next();
           System.out.println("Enter your order date");
           String order_date=sc.next();
           
           ps.setInt(1,id);
           ps.setString(2,name);
           ps.setString(3, order_menu);
           ps.setInt(4,quantity);
           ps.setInt(5, bill);
           ps.setString(6,address);
           ps.setString(7,phoneno);
           ps.setString(8,order_date);
           int p=ps.executeUpdate();
           System.out.println(p+"records add sucessfully");
           con.close();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		} 
	@Override
	public void order() {
		System.out.println("*********************************************");
		System.out.println("Order your favourite food here");
		System.out.println("*********************************************");
		System.out.println("----------------------------------------------");
		System.out.println("Our Special Dishes Are here");
		System.out.println("----------------------------------------------");

        System.out.println("Menu                                Price    ");
        System.out.println("1.Vadapav                           10       ");
        System.out.println("2.MisalPav                          40       ");
        System.out.println("3.SamosaPav                         20       ");
        System.out.println("4.Idali-Dosa                        60       ");
        System.out.println("5.MeduVada                          35       ");
        System.out.println("6.PavBhaji                          55       ");
        System.out.println("7.Tea                               10       ");
        System.out.println("8.Coffee                            15       ");
        System.out.println("9.Cold-Drink                        20       ");

			
		
	int vadapav=10;	
	int MisalPav=40;
	int SamosaPav=20;
	int Idali_Dosa=60;
	int MeduVada=35;
	int PavBhaji=55;
	int Tea=10;
	int Coffee=15;
	int Cold_Drink=20;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	int ch=sc.nextInt();
	System.out.println("Enter your quantity");
	int qu=sc.nextInt();
	if (ch==1)
	{
		int bill=vadapav*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==2)
	{
		int bill=MisalPav*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
	}
	else if(ch==3)
	{
		int bill=SamosaPav*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==4)
	{
		int bill=Idali_Dosa*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==5) 
	{
		int bill=MeduVada*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==6)
	{   
		int bill=PavBhaji*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==7)
	{
		int bill=Tea*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
		
	}
	else if(ch==8)
	{
		int bill=Coffee*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
	}
	else if(ch==9)
	{
		int bill=Cold_Drink*qu;
		System.out.println("your menu no is:"+ch);
		System.out.println("your menu quantity is:"+qu);
		System.out.println("your bill is:"+bill);
	}
	else {
		System.out.println("Kindly Choose Above Options");
	}
	}
		
		
			

		
		
	

	@Override
	public void update() {
		System.out.println("*********************************************");
		System.out.println("Update your customer details here");
		System.out.println("*********************************************");

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=con.prepareStatement("update hotel set menu=?,quantity=? ,bill=? where id=?");
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the menu");
		String menu=sc.next();
		System.out.println("Enter the quantity");
		int quantity=sc.nextInt();
		System.out.println("Enter the bill");
		int bill=sc.nextInt();
		
		ps.setInt(4,id);
		ps.setString(1, menu);
		ps.setInt(2, quantity);
		ps.setInt(3,bill);
		int p=ps.executeUpdate();
		System.out.println(p+"update the record sucessfully");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	@Override
	public void display() {
		System.out.println("*********************************************");
		System.out.println("Display your customer records here");
		System.out.println("*********************************************");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			ResultSet rs=st.executeQuery("select* from hotel");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			}}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

	@Override
	public void delete() {
		System.out.println("*********************************************");
		System.out.println("Delete your customer details here");
		System.out.println("*********************************************");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
			Scanner sc=new Scanner(System.in);
			PreparedStatement ps=con.prepareStatement("delete from hotel where id=?");
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			int p=ps.executeUpdate();
			System.out.println(p+"Delete the record sucessfully");
	}
		catch(Exception e) {
			System.out.println(e);
		}}
	@Override
	public void exit() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("Thank you for coming.....Visit Again");	
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

	}
	@Override
	public void rating() {
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************************************");
		System.out.println("You can give your feedback by rating");
		System.out.println("*********************************************");

		
		System.out.println("1. *      One rating");
		System.out.println("2. **     Two rating");
		System.out.println("3. ***    Three rating");
		System.out.println("4. ****   Four rating");
		System.out.println("5. *****  Five rating");
		System.out.println("----------------------------------------------");
		System.out.println("press any number for rating");
		System.out.println("----------------------------------------------");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("*");
			System.out.println("Extremly Poor");
			System.out.println("Thank you");
		}
		break;
		case 2:{
			System.out.println("**");
			System.out.println("Bad");
			System.out.println("Thank you");
			
		}
		break;
		case 3:{
			System.out.println("***");
			System.out.println("Average");
			System.out.println("Thank you");
		}
		break;
		case 4:{
			System.out.println("****");
			System.out.println("Good");
			System.out.println("Thank you");
		}
		break;
		case 5:{
			System.out.println("*****");
			System.out.println("Excellent");
			System.out.println("Thank you");
		}
		break;
		default:
		{
			System.out.println("choose a valid option....Thank you");
		}
		}
		

	}
	

	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("--------------------------------------");
		System.out.println("WELCOME TO FOOD TOUCH");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("--------------------------------------");
		System.out.println("Enter your username");
		String username=sc.next();
		System.out.println("Enter your password");
		String pwd=sc.next();
		String user="siddhi";
		String pass="1234";
		if(pass.equals(pwd) && user.equals(username)) {
			System.out.println("--------------------------------------");
			System.out.println("your details are correct");
			System.out.println("--------------------------------------");

			hotel1 h=new hotel1();
			int ch;
			while(true) {
			h.menulist();
			
			System.out.println("Enter your choice");
		    ch=sc.nextInt();
			switch(ch) {
		//System.out.println("--------------------------------");
			case 1:h.insert();
			break;
			case 2:h.order();
			break;
			case 3:h.update();
			break;
			case 4:h.display();
			break;
			case 5:h.rating();
			break;
			case 6:h.delete();
			break;
			case 7:h.exit();
			break;
			default:
			{
				System.out.println("Please enter valid choice");
			}
			}
		
		}}
		else {
			System.out.println("something went wrong");
		}
		
		
		
		
}


	}


