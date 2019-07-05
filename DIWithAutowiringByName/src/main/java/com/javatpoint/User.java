package com.javatpoint;

public class User {
	Address address;

	public User(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [address=" + address + "]";
	}
}
