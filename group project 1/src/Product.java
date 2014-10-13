import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Product extends java.lang.Object

{
	
private String snackName;
private int costInCents;
private int quantity;

Scanner file = new Scanner (new File("snacks.txt"));
int numberOfLinesOfData = file.nextInt();

static ArrayList <Product> results = new ArrayList<Product>();

	public Product(String n, int c, int q)
		{
	snackName = n;
	costInCents = c;
		}

	public String getSnackName() {
		return snackName;
	}

	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}

	public int getPrice() {
		return costInCents;
	}

	public void setPrice(int costInCents) {
		this.costInCents = costInCents;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	
}
}
