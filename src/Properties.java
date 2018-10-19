import java.util.LinkedList;

public class Properties 
{
	private Property[] a;
	public Properties()
	{
		a = new Property[40];
		insertProp();
	}
	
	public void insertProp()
	{
		Property p1 = new Property("Go", -1, -200);
		Property p2 = new Property("Reverse R*pe", 0, 60);
		Property p3 = new Property("Community Chest", -1, 0);
		Property p4 = new Property("Ugly Bastard", 0, 60);
		Property p5 = new Property("Income Tax", -1, 200);
		Property p6 = new Property("Useless Goddess Station", 8, 200);
		Property p7 = new Property("Thick Thigh Town", 1, 100);
		Property p8 = new Property("Chance", -1, 0);
		Property p9 = new Property("Justice Land", 1, 100);
		Property p10 = new Property("Big Titty Goth GF", 1, 100);
		Property p11 = new Property("Just Visting Jail", -1, 0);
		Property p12 = new Property("Boatgirl Bay", 2, 140);
		Property p13 = new Property("Electric Company", 9, 150);
		Property p14 = new Property("Planet-chan ISS", 2, 140);
		Property p15 = new Property("Snek Island", 2, 160);
		Property p16 = new Property("Dio Station", 8, 200);
		Property p17 = new Property("Loli Lounge", 3, 180);
		Property p18 = new Property("Community Chest", -1, 0);
		Property p19 = new Property("Platlet Park", 3, 180);
		Property p20 = new Property("Megamin Mayhem", 3, 200);
		Property p21 = new Property("Free Karma", -1, 0);
		Property p22 = new Property("Erwin Expressway", 4, 220);
		Property p23 = new Property("Chance", -1, 0);
		Property p24 = new Property("Culture Cult", 4, 220);
		Property p25 = new Property("Panzer Lake", 4, 240 );
		Property p26 = new Property("Darling Station", 8, 200);
		Property p27 = new Property("Cory Cabin", 5, 260);
		Property p28 = new Property("Close Cove", 5, 260);
		Property p29 = new Property("Water Works", 9, 150);
		Property p30 = new Property("Oreo County", 5, 280);
		Property p31 = new Property("Go To Jail", -1, 0);
		Property p32 = new Property("Sign Street", 6, 300);
		Property p33 = new Property("Sauce Pit", 6, 320);
		Property p34 = new Property("Blends S Street", 6, 300);
		Property p35 = new Property("Community Chest", -1, 0);
		Property p36 = new Property("Monika Station", 8, 200);
		Property p37 = new Property("Chance", -1, 0);
		Property p38 = new Property("Ahegao Avenue", 7, 350);
		Property p39 = new Property("Super Tax", -1, 100);
		Property p40 = new Property("Roman Road", 7, 400);
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
	public Property getProp(int b)
	{
		return a[b];
	}
}
