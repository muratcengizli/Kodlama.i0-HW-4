package Main;


import Concrete.CampainManager;
import Concrete.PlayerManager;
import Concrete.SalesServiceManager;
import Entities.Campain;
import Entities.Player;
import kodlama.io.BankConfirmation;
import kodlama.io.EdevletConfirmation;
import kodlama.io.InternetCampain;
import kodlama.io.InternetSale;
import kodlama.io.PhoneCampain;
import kodlama.io.PhoneSales;

public class Main {

	public static void main(String[] args) {
		
		SalesServiceManager salesServiceManager1 = new SalesServiceManager(new InternetSale());
		SalesServiceManager salesServiceManager2 = new SalesServiceManager(new PhoneSales());
		PlayerManager playerManager1 = new PlayerManager(new EdevletConfirmation());
		PlayerManager playerManager2 = new PlayerManager(new BankConfirmation());
		CampainManager campainManager1 = new CampainManager(new InternetCampain());
		CampainManager campainManager2 = new CampainManager(new PhoneCampain());
		Campain campain1 = new Campain("1", "Internet");
		Campain campain2 = new Campain("2", "Phone");
		Player player1 = new Player("12345678", "Murat", "Cengizli", "11.08.1991");
		Player player2 = new Player("12341234", "Övünç", "Girgin", "01.01.1992");
		
		
		salesServiceManager1.buyingGame(player1);
		campainManager1.add(campain1);
		playerManager1.add(player1);
		
		salesServiceManager2.buyingGame(player2);
		campainManager2.add(campain2);
		playerManager2.add(player2);
					
	}
}
