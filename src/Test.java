
public class Test {

	public static void main(String[] args) {

		Product product = new Product(1, "Iphone");
		product.setName("Iphone");
		product.id= 2;
		
		// if we do by getter or by simple product.id, whats the use. and product.id overwrites the setter method.

		System.out.println(product.getId());

		String s = "123";
		Integer i = new Integer(456);

		System.out.println(s);
		System.out.println(i);
	}

}
