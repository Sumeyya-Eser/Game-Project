package interfaces;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ISellService {

	void sellProduct(Customer customer,Game game);
	void discountProductSell(Customer customer,Game game, Campaign campaign);
}
