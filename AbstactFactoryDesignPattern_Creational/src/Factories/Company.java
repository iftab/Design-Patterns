package Factories;

import product.Gpu;
import product.Monitor;

public abstract class Company {
   public abstract Gpu createGpu();
   public abstract Monitor createMonitor();
}
