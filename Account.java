import java.lang.*;
import java.util.*;

import java.io.*;

public class Account
{
	private String username;
	private String pass;
	private String name;
	private int phoneNumber;
	private String address;
	
	private String customerLicense;
	private String customerLicenseClass;
	private String customerLicenseIssuanceState;
	private String customerLicenseIssuanceDate;
	private String customerLicenseExpiryDate;
	private String guarntorname;
	private String placeofwork;
	private int phonenumber;
	private String signature;
	
	
	
	
	
	
	
	private File file;
	private FileWriter fwriter;
	private Scanner sc;
	
	public Account()
	{
		this.username="";
	}
	
	public Account(String username, String pass, String name, int phoneNumber, String address,
                String customerLicense, String customerLicenseClass, String customerLicenseIssuanceState,
                String customerLicenseIssuanceDate, String customerLicenseExpiryDate, String guarntorname,
                String placeofwork, int phonenumber, String signature) {

	
	
	
	
	
	
		this.username=username;
		this.pass=pass;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.customerLicense=customerLicense;
		this.customerLicenseClass=customerLicenseClass;
		this.customerLicenseIssuanceState=customerLicenseIssuanceState;
		this.customerLicenseIssuanceDate=customerLicenseIssuanceDate;
		this.customerLicenseExpiryDate=customerLicenseExpiryDate;
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

    public void setcustomerLicense(String customerLicense) {
        this.customerLicense = customerLicense;
    }

    public void setcustomerLicenseClass(String customerLicenseClass) {
        this.customerLicenseClass = customerLicenseClass;
    }

    public void setcustomerLicenseIssuanceState(String customerLicenseIssuanceState) {
        this.customerLicenseIssuanceState = customerLicenseIssuanceState;
    }

    public void setcustomerLicenseIssuanceDate(String customerLicenseIssuanceDate) {
        this.customerLicenseIssuanceDate = customerLicenseIssuanceDate;
    }

    public void setCustomerLicenseExpiryDate(String customerLicenseExpiryDate) {
        this.customerLicenseExpiryDate = customerLicenseExpiryDate;
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

    public String getCustomerLicense() {
        return customerLicense;
    }

    public String getCustomerLicenseClass() {
        return customerLicenseClass;
    }

    public String getCustomerLicenseIssuanceState() {
        return customerLicenseIssuanceState;
    }

    public String getCustomerLicenseIssuanceDate() {
        return customerLicenseIssuanceDate;
    }

    public String getCustomerLicenseExpiryDate() {
        return customerLicenseExpiryDate;
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
	
	public void addaccount()
	{
		try{
		file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Customer.txt");

		file.createNewFile();
		fwriter=new FileWriter(file,true);
	         fwriter.write("UserName:" + getUsername() + "\n");
            fwriter.write("Password:" + getPass() + "\n");

            fwriter.write("Name:" + getName() + "\n");
            fwriter.write("PhoneNumber:" + getPhoneNumber() + "\n");
            fwriter.write("Address:" + getAddress() + "\n");

            fwriter.write("CustomerLicense:" + getCustomerLicense() + "\n");
            fwriter.write("CustomerLicenseClass:" + getCustomerLicenseClass() + "\n");
            fwriter.write("CustomerLicenseIssuanceState:" + getCustomerLicenseIssuanceState() + "\n");
            fwriter.write("CustomerLicenseIssuanceDate:" + getCustomerLicenseIssuanceDate() + "\n");
            fwriter.write("CustomerLicenseExpiryDate:" + getCustomerLicenseExpiryDate() + "\n");

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
public boolean getAccount(String name, String pass) {
    boolean flag = false;
    file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Customer.txt");

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

	
