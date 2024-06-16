package Factories;

import product.AsusGPU;
import product.Gpu;
import product.Monitor;
import product.MsiMonitor;

public class AsusManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		// TODO Auto-generated method stub
		return new AsusGPU();
	}

	@Override
	public Monitor createMonitor() {
		// TODO Auto-generated method stub
		return new MsiMonitor();
	}

}
