import java.lang.*;
import java.util.*;

import java.io.*;

public class AccountDriver
{
	private String username;
	private String pass;
	private String name;
	private int phoneNumber;
	private String address;
	
	private String DriverLicense;
	private String DriverLicenseClass;
	private String DriverLicenseIssuanceState;
	private String DriverLicenseIssuanceDate;
	private String DriverLicenseExpiryDate;
	private String guarntorname;
	private String placeofwork;
	private int phonenumber;
	private String signature;
	
	
	
	
	
	
	
	private File file;
	private FileWriter fwriter;
	private Scanner sc;
	
	public AccountDriver()
	{
		this.username="";
	}
	
	public AccountDriver(String username, String pass, String name, int phoneNumber, String address,
                String DriverLicense, String DriverLicenseClass, String DriverLicenseIssuanceState,
                String DriverLicenseIssuanceDate, String DriverLicenseExpiryDate, String guarntorname,
                String placeofwork, int phonenumber, String signature) {

	
	
	
	
	
	
		this.username=username;
		this.pass=pass;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.DriverLicense=DriverLicense;
		this.DriverLicenseClass=DriverLicenseClass;
		this.DriverLicenseIssuanceState=DriverLicenseIssuanceState;
		this.DriverLicenseIssuanceDate=DriverLicenseIssuanceDate;
		this.DriverLicenseExpiryDate=DriverLicenseExpiryDate;
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

    public void setDriverLicense(String DriverLicense) {
        this.DriverLicense = DriverLicense;
    }

    public void setDriverLicenseClass(String DriverLicenseClass) {
        this.DriverLicenseClass = DriverLicenseClass;
    }

    public void setDriverLicenseIssuanceState(String DriverLicenseIssuanceState) 
	{
        this.DriverLicenseIssuanceState = DriverLicenseIssuanceState;
    }

    public void setDriverLicenseIssuanceDate(String DriverLicenseIssuanceDate) {
        this.DriverLicenseIssuanceDate = DriverLicenseIssuanceDate;
    }

    public void setDriverLicenseExpiryDate(String DriverLicenseExpiryDate) {
        this.DriverLicenseExpiryDate = DriverLicenseExpiryDate;
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

    public String getDriverLicense() {
        return DriverLicense;
    }

    public String getDriverLicenseClass() {
        return DriverLicenseClass;
    }

    public String getDriverLicenseIssuanceState() {
        return DriverLicenseIssuanceState;
    }

    public String getDriverLicenseIssuanceDate() {
        return DriverLicenseIssuanceDate;
    }

    public String getDriverLicenseExpiryDate() {
        return DriverLicenseExpiryDate;
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
	
	public void addaccountDriver()
	{
		try{
		file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Driver.txt");

		file.createNewFile();
		fwriter=new FileWriter(file,true);
	         fwriter.write("UserName:" + getUsername() + "\n");
            fwriter.write("Password:" + getPass() + "\n");

            fwriter.write("Name:" + getName() + "\n");
            fwriter.write("PhoneNumber:" + getPhoneNumber() + "\n");
            fwriter.write("Address:" + getAddress() + "\n");

            fwriter.write("DriverLicense:" + getDriverLicense() + "\n");
            fwriter.write("DriverLicenseClass:" + getDriverLicenseClass() + "\n");
            fwriter.write("DriverLicenseIssuanceState:" + getDriverLicenseIssuanceState() + "\n");
            fwriter.write("DriverLicenseIssuanceDate:" + getDriverLicenseIssuanceDate() + "\n");
            fwriter.write("DriverLicenseExpiryDate:" + getDriverLicenseExpiryDate() + "\n");

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
public boolean getAccountDriver(String name, String pass) {
    boolean flag = false;
    file = new File("D:\\JAVA Code\\SwiftGo\\Frame1\\Data\\Driver.txt");

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

	
