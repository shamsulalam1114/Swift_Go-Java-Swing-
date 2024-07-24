import java.lang.*;
import java.util.*;

import java.io.*;

public class AccountEmployee
{
	private String username;
	private String pass;
	private String name;
	private int phoneNumber;
	private String address;
	
	private String EmployeLicense;
	private String EmployeLicenseClass;
	private String EmployeLicenseIssuanceState;
	private String EmployeLicenseIssuanceDate;
	private String EmployeLicenseExpiryDate;
	private String guarntorname;
	private String placeofwork;
	private int phonenumber;
	private String signature;
	
	
	
	
	
	
	
	private File file;
	private FileWriter fwriter;
	private Scanner sc;
	
	public AccountEmployee()
	{
		this.username="";
	}
	
	public AccountEmployee(String username, String pass, String name, int phoneNumber, String address,
                String EmployeLicense, String EmployeLicenseClass, String EmployeLicenseIssuanceState,
                String EmployeLicenseIssuanceDate, String EmployeLicenseExpiryDate, String guarntorname,
                String placeofwork, int phonenumber, String signature) {

	
	
	
	
	
	
		this.username=username;
		this.pass=pass;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.EmployeLicense=EmployeLicense;
		this.EmployeLicenseClass=EmployeLicenseClass;
		this.EmployeLicenseIssuanceState=EmployeLicenseIssuanceState;
		this.EmployeLicenseIssuanceDate=EmployeLicenseIssuanceDate;
		this.EmployeLicenseExpiryDate=EmployeLicenseExpiryDate;
		this.guarntorname=guarntorname;
		this.placeofwork=placeofwork;
		this.phonenumber=phonenumber;
		this.signature=signature;
	}
	
	public void setusername( String username)
	{
	this.username=username;}
	
    public void setPass( String pass) 
	{
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeLicense(String EmployeLicense) {
        this.EmployeLicense = EmployeLicense;
    }

    public void setEmployeLicenseClass(String EmployeLicenseClass) {
        this.EmployeLicenseClass = EmployeLicenseClass;
    }

    public void setEmployeLicenseIssuanceState(String EmployeLicenseIssuanceState) {
	this.EmployeLicenseIssuanceState=EmployeLicenseIssuanceState;}

    public void setEmployeLicenseIssuanceDate(String EmployeLicenseIssuanceDate) {
        this.EmployeLicenseIssuanceDate = EmployeLicenseIssuanceDate;
    }

    public void setEmployeLicenseExpiryDate(String EmployeLicenseExpiryDate) {
        this.EmployeLicenseExpiryDate =EmployeLicenseExpiryDate;
    }

    public void setGuarantorName(String guarntorname) {
        this.guarntorname = guarntorname;
    }

    public void setPlaceOfWork(String placeofwork) {
        this.placeofwork = placeofwork;
    }

    public void setphonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeLicense() {
        return EmployeLicense;
    }

    public String getEmployeLicenseClass() {
        return EmployeLicenseClass;
    }

    public String getEmployeLicenseIssuanceState() {
        return EmployeLicenseIssuanceState;
    }

    public String getEmployeLicenseIssuanceDate() {
        return EmployeLicenseIssuanceDate;
    }

    public String getEmployeLicenseExpiryDate() {
        return EmployeLicenseExpiryDate;
    }

    public String getGuarantorName() {
        return guarntorname;
    }

    public String getPlaceOfWork() {
        return placeofwork;
    }

    public int getphonenumber() {
        return phonenumber;
    }

    public String getSignature() {
        return signature;
    }
	
	public void addaccountEmployee()
	{
		try{
		file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Employe.txt");

		file.createNewFile();
		fwriter=new FileWriter(file,true);
	         fwriter.write("UserName:" + getUsername() + "\n");
            fwriter.write("Password:" + getPass() + "\n");

            fwriter.write("Name:" + getName() + "\n");
            fwriter.write("PhoneNumber:" + getPhoneNumber() + "\n");
            fwriter.write("Address:" + getAddress() + "\n");

            fwriter.write("EmployeLicense:" + getEmployeLicense() + "\n");
            fwriter.write("EmployeLicenseClass:" + getEmployeLicenseClass() + "\n");
            fwriter.write("EmployeLicenseIssuanceState:" + getEmployeLicenseIssuanceState() + "\n");
            fwriter.write("EmployeLicenseIssuanceDate:" + getEmployeLicenseIssuanceDate() + "\n");
            fwriter.write("EmployeLicenseExpiryDate:" + getEmployeLicenseExpiryDate() + "\n");

            fwriter.write("GuarantorName:" + getGuarantorName() + "\n");
            fwriter.write("PlaceOfWork:" + getPlaceOfWork() + "\n");
            fwriter.write("GuarantorPhoneNumber:" + getphonenumber() + "\n");
            fwriter.write("Signature:" + getSignature() + "\n");
		
		
		fwriter.flush();
		fwriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	// Account class
public boolean getAccountEmployee(String name, String pass) {
    boolean flag = false;
    file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Employe.txt");

    try {
        sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] values = line.split(":");
            if (values.length >= 2 && values[0].equals("UserName") && values[1].equals(name)) {
                // Found matching username, now check the password
                if (sc.hasNextLine()) {
                    line = sc.nextLine();
                    values = line.split(":");
                    if (values.length >= 2 && values[0].equals("Password") && values[1].equals(pass)) {
                        flag = true;
                        break;
                    }
                }
            }
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();
    } finally {
        if (sc != null) {
            sc.close();
        }
    }

    return flag;
}

}

	
