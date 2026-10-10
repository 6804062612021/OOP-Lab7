//6804062612021
//package homework7;

import java.util.Scanner;

public class q5_Manager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee emp = new Manager();
		Address address = new Address();
		C.constructAddress(address, input.next(), input.next());
		C.constructEmployee(emp,input.nextInt(),
							input.next(),
							input.nextDouble(),
							address);
		((Manager)emp).setParkingNo(input.next());
		System.out.println(((Manager)emp).getDetails()+((Manager)emp).getAddress().getAddressInfo());
	}
}

class Employee {
	protected int id;
	protected String name;
	protected double salary;
	protected Address address;

	public String getDetails() {
		return "ID: " + id + "\nName: " + name + "\nSalary: " + salary + '\n';
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }
	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }
}

class Manager extends Employee {
	protected String parkingNo;

	@Override
	public String getDetails() {
		return "ID: " + id + "\nName: " + name + "\nSalary: " + salary + "\nParking No.: " + parkingNo + "\n";
	}
	public String getParkingNo() { return parkingNo; }
	public void setParkingNo(String parkingNo) { this.parkingNo = parkingNo; }	
}


final class C { // everything constructor
	public static void constructEmployee(Employee emp, int id , String name, double salary, Address address) {
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAddress(address);
	}
	
	public static void constructAddress(Address address, String street, String city) {
		address.setStreet(street);
		address.setCity(city);
	}
}
class Address {
	protected String street, city;

	public String getAddressInfo() {
		return "Street: " + street + "\nCity: " + city + "\n";
	}
	public String getStreet() { return street; }
	public void setStreet(String street) { this.street = street; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	
}
