package emailapp;

import java.util.Scanner;

public class Email {
        private String firstName;
        private  String lastName;
        private String password;
        private String department;
        private String email;
        private String alternateEmail;
        private int defaultPasswordLength = 10;
        private int mailboxCapacity=1500;
        private String companySuffix = "company.com";
        
       
        
        //constructor to receive the first name and last name
       
        public Email(String firstName, String lastName) {
        	
        	this.firstName = firstName;
        	this.lastName = lastName;
        	System.out.println("WELCOME : "+ firstName );
        	
        	
        	
        	//Call a method asking for the department - return the department
        	this.department=setDepartment();
        	System.out.println("Department : "+this.department);
        	
        	
        	
        	//combines element to generate email
        	email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department + companySuffix;
        	//System.out.println("Youe Email : "+email);
        	
        	
        	
        	
        	//Call a method that returns a random password
        	this.password = randomPassword(defaultPasswordLength);
        	//System.out.println("Your password is : "+this.password);
        	
//        	//combines element to generate email
//        	email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department + companySuffix;
//        	System.out.println("Youe Email : "+email);
//        	
        }
        
       
        
        //Ask for the department
        private String setDepartment(){
        	System.out.println(" ENTER YOUR DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department code :");
        	Scanner scn = new Scanner(System.in);
        	int depChoice = scn.nextInt();
        	if(depChoice==1) return "sales";
        	else if(depChoice==2)return "dev";
        	else if (depChoice==3)return "acct";
        	else return"";
        }
       
        
        
        //Generate a random password
        private String randomPassword(int length) {
        	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@*^%}{[]/><~`#$";
        	char[] password = new char[length];
        	for(int i=0;i<length;i++) {
        		int ran = (int)(Math.random() * passwordSet.length());
        		password[i]= passwordSet.charAt(ran);
//        		System.out.println(ran);
//        		System.out.println(passwordSet.charAt(ran));
        	}
        	return new String (password);
        }
        
        
        //set the mailbox capacity
        public void setMailboxCapacity(int capacity) {
        	this.mailboxCapacity= capacity;
        }
        
        //set the alternate email
        public void setAlternateEmail(String altEmail) {
        	this.alternateEmail= altEmail;
        }
        
        //change the password
        public void changePassword(String password) {
        	this.password=password;
        }
        
        public int getMailboxCapacity() { return mailboxCapacity; }
        
        public String getAlternateEmail() { return alternateEmail ;}
        
        public String getpassword() { return password ;}
        
        public String showInfo() {
        	return "DISPLAY NAME : "+ firstName + " "+lastName + "\nCOMPANY EMAIL : "+ email +
        			"\nMAILBOX CAPACITY : "+mailboxCapacity ;
        }
	
	}


