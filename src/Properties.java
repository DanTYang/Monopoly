import java.util.LinkedList;
import java.util.Queue;

public class Properties 
{
	private Property[] a;
	private int n;
	private int z;
	private int G;
	public Properties()
	{
		int n = 1;
		z = 4;
		a = new Property[40];
		insertProp();
	}
	public void insertProp()
	{
		DiceRoller tempRoller = new DiceRoller();
		Property p1 = new Property("Go", -1, 0, 0);
		Property p2 = new Property("Mediterranean Avenue", 0, 60, 2);
		Property p3 = new Property("Community Chest", -1, 0, 0);
		Property p4 = new Property("Baltic Avenue", 0, 60, 4);
		Property p5 = new Property("Income Tax", -1, 0, 200);
		Property p6 = new Property("Reading Railroad", 8, 200, 25 * n);
		Property p7 = new Property("Oriental Avenue", 1, 100, 6);
		Property p8 = new Property("Chance", -1, 0, 0);
		Property p9 = new Property("Vermont Avenue", 1, 100, 6);
		Property p10 = new Property("Connecticut Avenue", 1, 100, 8);
		Property p11 = new Property("Just Visting Jail", -1, 0, 0);
		Property p12 = new Property("St. Charles Place", 2, 140, 10);
		Property p13 = new Property("Electric Company", 9, 150, (tempRoller.total() * z));
		Property p14 = new Property("States Avenue", 2, 140, 10);
		Property p15 = new Property("Virginia Avenue", 2, 160, 12);
		Property p16 = new Property("Pennsylvania Railroad", 8, 200, 25 * n);
		Property p17 = new Property("St. James Place", 3, 180, 14);
		Property p18 = new Property("Community Chest", -1, 0, 0);
		Property p19 = new Property("Tennesse Avenue", 3, 180, 14);
		Property p20 = new Property("New York Avenue", 3, 200, 16);
		Property p21 = new Property("Free Parking", -1, 0, (-1 * G));
		Property p22 = new Property("Kentucky Avenue", 4, 220, 18);
		Property p23 = new Property("Chance", -1, 0, 0);
		Property p24 = new Property("Indiana Avenue", 4, 220, 18);
		Property p25 = new Property("Illinois Avenue", 4, 240, 20);
		Property p26 = new Property("B.B.O. Railroad", 8, 200, 25 * n);
		Property p27 = new Property("Atlantic Avenue", 5, 260, 22);
		Property p28 = new Property("Vermnot Avenue", 5, 260, 22);
		Property p29 = new Property("Water Works", 9, 150, (tempRoller.total() * z));
		Property p30 = new Property("Marvin Gardens", 5, 280, 24);
		Property p31 = new Property("Go To Jail", -1, 0, 0);
		Property p32 = new Property("Pacific Avenue", 6, 300, 26);
		Property p33 = new Property("North Carolina Avenue", 6, 320, 26);
		Property p34 = new Property("Community Chest", -1, 0, 0);
		Property p35 = new Property("Pennsylvania Avenue", 6, 300, 28);
		Property p36 = new Property("Short Line", 8, 200 , 25 * n);
		Property p37 = new Property("Chance", -1, 0, 0);
		Property p38 = new Property("Park Place", 7, 350, 35);
		Property p39 = new Property("Luxury Tax", -1, 0, 100);
		Property p40 = new Property("Boardwalk", 7, 400,50);
		a[0] = p1;
		a[1] = p2;
		a[2] = p3;
		a[3] = p4;
		a[4] = p5;
		a[5] = p6;
		a[6] = p7;
		a[7] = p8;
		a[8] = p9;
		a[9] = p10;
		a[10] = p11;
		a[11] = p12;
		a[12] = p13;
		a[13] = p14;
		a[14] = p15;
		a[15] = p16;
		a[16] = p17;
		a[17] = p18;
		a[18] = p19;
		a[19] = p20;
		a[20] = p21;
		a[21] = p22;
		a[22] = p23;
		a[23] = p24;
		a[24] = p25;
		a[25] = p26;
		a[26] = p27;
		a[27] = p28;
		a[28] = p29;
		a[29] = p30;
		a[30] = p31;
		a[31] = p32;
		a[32] = p33;
		a[33] = p34;
		a[34] = p35;
		a[35] = p36;
		a[36] = p37;
		a[37] = p38;
		a[38] = p39;
		a[39] = p40;		
	}
	public void changeN(int ntemp)
	{
		n = ntemp;
	}
	public void changeZ(int ztemp)
	{
		z = ztemp;
	}
	public void changeG(int Gtemp)
	{
		G += Gtemp;
	}
	public Property getProp(int b)
	{
		return a[b];
	}
}
