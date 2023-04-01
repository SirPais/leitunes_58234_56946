package domain.core;


// ALTERAR PARA FICAR IMUTAVEL
public class Rate
{
	
	int rating = 0;
	
	public Rate(int rating)
	{
		this.rating = rating;
	}
	
	public void increase()
	{
		this.rating++;
	}
	
	public void decrease()
	{
		this.rating--;
	}
}

