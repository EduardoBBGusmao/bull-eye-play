package controllers;

import play.mvc.*;
import models.Product;
import static play.libs.Scala.asScala;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    List<Product> products;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public void getListProducts(){
        products = com.google.common.collect.Lists.newArrayList();
        Product p1 = new Product("Investment Tracker", "Visualizar a situação dos seus investimentos no momento.", "images/graph-11.png");
        Product p2 = new Product("Investment Allocation", "Visualizar a alocação dos seus investimentos.", "images/graph-18.png");

        this.products.add(p1);
        this.products.add(p2);

    }
    public Result index() {
        getListProducts();
        return ok(views.html.index.render(asScala(this.products)));
    }

}
