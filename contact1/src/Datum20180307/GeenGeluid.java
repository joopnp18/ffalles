package Datum20180307;

public class GeenGeluid
{
	public static void main(String[] args)
	{
		GeenGeluid gg = new GeenGeluid();
		gg.start();
	}
		void start()
		{
		Versterker versterker = new Versterker();
		versterker.geengeluid = false;

		try
			{
				versterker.aanzetten();
			}
		catch (Exception e)
			{
				System.out.println("hij staat niet aan");
			}
		}
}
class Versterker
{
	boolean geengeluid = true;
	void aanzetten() throws Exception{
		if(geengeluid) {
			System.out.println("Hell yeah!");
		}else {
			throw new Exception();
		}
	}
}
