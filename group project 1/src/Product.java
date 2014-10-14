import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product extends java.lang.Object

{
	
private String snackName;
private int costInCents;
private int amount;

public static void getText() throws IOException 
{
	
	Scanner file = new Scanner (new File("snacks.txt"));
	
}



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
		return amount;
	}

	public void setQuantity(int quantity) {
		this.amount = quantity;
	
}
}
