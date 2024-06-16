import java.util.Arrays;
import Factories.AsusManufacturer;
import Factories.Company;
import Factories.MsiManufacturer;
import product.Product;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company msi = new MsiManufacturer();
		Company asus = new AsusManufacturer();
		
		Arrays.asList(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor()).forEach(Product::assemble);;
	}

}
