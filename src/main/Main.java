package main;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import adaptor.MernisServiceAdaptor;
import manager.CampaignManager;
import manager.CustomerManager;
import manager.GameManager;
import manager.OrderManager;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		Customer customer1 = new Customer("SÜMEYYA", "ESER", LocalDate.of(1880, 5, 13), Long.parseLong("0000000000"));
		Customer customer2 = new Customer("ENGÝN", "DEMÝROG", LocalDate.of(1880, 5, 13), Long.parseLong("0000000000"));

		Game game1 = new Game("Counter Strike", 1000);
		Game game2 = new Game("Fifa 2021", 2000);

		Campaign campaign1 = new Campaign("Mayýs indirimi", 50);
		Campaign campaign2 = new Campaign("Efsane Cuma Indirimleri", 50);

		CustomerManager customerManager = new CustomerManager(new MernisServiceAdaptor());
		customerManager.add(customer1);
		customerManager.add(customer2);

		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.add(game1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);

		OrderManager orderManager = new OrderManager();
		orderManager.discountProductSell(customer1, game1, campaign1);
		orderManager.sellProduct(customer2, game1);

		campaignManager.delete(campaign2);
		gameManager.add(game1);
		customerManager.delete(customer2);

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("123456"), "AD", "SOYAD", 1950);
		System.out.println("doðrulama: " + (result ? "baþarýlý " : "baþarýsýz"));

	}

}
