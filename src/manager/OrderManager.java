package manager;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import interfaces.ISellService;

public class OrderManager implements ISellService{

	@Override
	public void sellProduct(Customer customer, Game game) {
		System.out.println(customer.getFirstName() +" "+ customer.getLastName() + " buyed " + game.getGameName());
	}

	@Override
	public void discountProductSell(Customer customer, Game game, Campaign campaign) {
		System.out.println(customer.getFirstName() +" "+ customer.getLastName()+ " buyed " + game.getGameName() + " with discount: " +
	campaign.getDiscountAmount() + campaign.getCampaignName());
		
	}

}
