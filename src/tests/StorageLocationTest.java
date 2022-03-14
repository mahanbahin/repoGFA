package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import StorageLocations.StorageLocationActions;

public class StorageLocationTest {

	StorageLocationActions storageLocationActions;
	
	@BeforeClass
	public void beforeClass() {
		storageLocationActions = new StorageLocationActions();
	}

	@Test
	public void navigateToLocationStorageItems() throws Throwable {
		Thread.sleep(5000);
		storageLocationActions
		.clickstorageLocationLink();
		System.out.println("clicked strg");
		
	}
}
