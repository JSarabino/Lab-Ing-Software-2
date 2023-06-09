
package co.edu.unicauca.openmarket.main;

import co.edu.unicauca.openmarket.access.Factory;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.domain.service.ProductService;
import co.edu.unicauca.openmarket.presentation.GUIProducts;
import co.edu.unicauca.openmarket.presentation.GUIProductsFind;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        
        GUIProducts instance = new GUIProducts(productService);
        instance.setVisible(true);
        GUIProductsFind instance2 = new GUIProductsFind(null,false,productService);
        instance2.setVisible(true);
        productService.addObservador(instance2);
    }
    
}
