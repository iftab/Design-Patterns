package Factories;

import product.Gpu;
import product.Monitor;
import product.MsiGpu;
import product.MsiMonitor;

public class MsiManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		// TODO Auto-generated method stub
		return new MsiGpu();
	}

	@Override
	public Monitor createMonitor() {
		// TODO Auto-generated method stub
		return new MsiMonitor();
	}

}
