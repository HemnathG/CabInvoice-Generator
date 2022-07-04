package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(5.0, 4);
		Assert.assertEquals(54, totalFare, totalFare);
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(0.1, 2);
		Assert.assertEquals(5, totalFare, totalFare);
	}

	@Test
	public void givenMultipleRides_ShouldCalculateAggregateTotal() {

		Rides[] rides = { new Rides(5, 4), new Rides(0.1, 2) };

		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(rides);
		Assert.assertEquals(54, totalFare, totalFare);
	}
}
